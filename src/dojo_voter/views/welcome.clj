(ns dojo-voter.views.welcome
  (:require [dojo-voter.views.common :as common]
            [noir.content.getting-started]
            [dojo-voter.models.topic :as topic])
  (:use [noir.core :only [defpage]]
         [hiccup.form]))

(defpage "/" []
         (common/layout
           [:p "Welcome to dojo-voter"]
           (form-to [:post "/add-topic"]
               (text-field "topicname" )
               (submit-button "Create"))
         [:div#cnt 
          [:a {:href "vote-up"} "vote up" ]
          [:a {:href "vote-down"} "vote down" ]
          [:span ]]))

(defpage [:post "/add-topic"] {:as topic}
  (common/layout
    (topic/save topic)
    [:h1 "saved topic" ]))
