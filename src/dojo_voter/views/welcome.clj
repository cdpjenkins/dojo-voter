(ns dojo-voter.views.welcome
  (:require [dojo-voter.views.common :as common]
            [noir.content.getting-started]
            [dojo-voter.models.topic :as topic]
            [noir.response :as resp])
  (:use [noir.core :only [defpage]]
         [hiccup.form]))

(defpage "/" []
   (common/layout
     [:p "Welcome to dojo-voter"]
     (form-to [:post "/add-topic"]
         (text-field "topicname" )
         (submit-button "Create"))
    [:ul
     (map common/topic (topic/get-all))]))

(defpage [:post "/add-topic"] {:as topic}
  (topic/save topic)
  (resp/redirect "/"))
