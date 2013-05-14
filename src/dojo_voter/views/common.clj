(ns dojo-voter.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "dojo-voter"]
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper
                content]]))

(defpartial topic [{:keys [name votes]}]
  [:li 
    [:a {:href "vote-up"} "vote up" ]
    [:a {:href "vote-down"} "vote down" ]
    [:span votes]
    [:span name]])