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

## Requirements

See each project README.

## Running

Gradle subprojects can be invoked from toplevel.

To run front (webpack dev server):

```bash
gradle frontDev
```

To run back (war java app running on tomcat):

```bash
gradle tomcatRun
```

## Findings

So far the best approach is to publish front and back as separate .war files and
disable history mode, since it makes impossible the app returns 404 status.

In resume, avoid history mode.
