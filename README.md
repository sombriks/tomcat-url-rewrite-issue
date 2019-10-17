# url rewrite issue

This explorative solution studies a very specific issue related to SPA's with
history mode enabled being deployed on apache tomcat.

Modern SPA's uses [history api](https://developer.mozilla.org/en-US/docs/Web/API/History)
to manage application routing.

Such approach however demands special configuration on server-side known as
[url rewriting](https://en.wikipedia.org/wiki/Rewrite_engine).

In most cases the use of reverse proxies like [haproxy](http://www.haproxy.org/)
or [ngnix](https://www.nginx.com/) solves the case, but the subject scenario
proposed here is to solve the issue using tomcat server itself.
