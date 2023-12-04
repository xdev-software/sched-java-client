# 1.1.1
* Removed unused dependency ``com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider``

# 1.1.0
* Add undocumented ``video_stream`` field for sessions.<br/>Affected endpoints are:
  * ``/session/add``
  * ``/session/mod``
  * ``/session/export``

# 1.0.2
* Add all available fields to model returned by ``/user/list``
* Updated dependencies

# 1.0.1
* Throw ``APIException`` instead ``ClassCastException`` when error is encountered #12
* Updated dependencies

# 1.0.0 

* Initial release
* Supports the following Sched API endpoints
  * ``/session/add``
  * ``/session/mod``
  * ``/session/del``
  * ``/session/list``
  * ``/session/export``
  * ``/user/list``
  * ``/user/add``
  * ``/role/add``
  * ``/role/del``
