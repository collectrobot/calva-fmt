
#_{:åkerö} {:åkerö}

{:foo #_bar :bar #_foo'foo #_'foo'bar #_'#foo'bar}

#_:foo:bar :foo:bar

#_1.2M 1.2M

#_'foo 'foo

#_foo foo

#_#foo #foo

        #_#?(:cljs foo
             :clj bar)
        #?(:cljs foo
           :clj bar)

#_(:cljs foo
         :clj bar)
(:cljs foo
       :clj bar)

#_'(FOOBAR :bar) '(FOOBAR :bar)

#_(FOOBAR :bar) (FOOBAR :bar)

#_"foo" "foo"

#_#"foo\sbar" #"foo\sbar"

#_(defn foo []
    :bar)
(defn foo [])

#_[:bar
   [:p.apa]]
[:bar
 [:p.apa]]

#_((foo)) #((foo))

#_#{:foo :bar
    (comment
      #_#"\sfoo" bar)

    #_'(foo :bar ["foo" #"\s*"]) {:bar}}