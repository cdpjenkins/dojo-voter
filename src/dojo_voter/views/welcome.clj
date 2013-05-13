(ns dojo-voter.views.welcome
  (:require [dojo-voter.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to dojo-voter"]))
