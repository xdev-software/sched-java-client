[![Latest version](https://img.shields.io/maven-central/v/com.xdev-software/sched-java-client?logo=apache%20maven)](https://mvnrepository.com/artifact/com.xdev-software/sched-java-client)
[![Build](https://img.shields.io/github/actions/workflow/status/xdev-software/sched-java-client/checkBuild.yml?branch=develop)](https://github.com/xdev-software/sched-java-client/actions/workflows/checkBuild.yml?query=branch%3Adevelop)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=xdev-software_sched-java-client&metric=alert_status)](https://sonarcloud.io/dashboard?id=xdev-software_sched-java-client)
[![API Specification Editor](https://img.shields.io/badge/API--Spec-Editor-85ea2d?logo=swagger)](https://editor.swagger.io/?url=https://raw.githubusercontent.com/xdev-software/sched-java-client/develop/openapi/openapi.yml)

# <img src="https://i0.wp.com/sched.com/wp-content/uploads/2021/11/cropped-favicon.png?fit=28,28&ssl=1" height="28" /> [sched](https://sched.com/)-java-client
Java client for the [Sched API](https://sched.com/api)

> **Note**
> A API-Key is required for using the API.<br/>
> You can get a key - if you have a payed plan - at https://insertYourConferenceHERE.sched.com/editor/exports/api

This client [is generated](./sched-java-client/pom.xml) from an [``openapi.yml``](./openapi/openapi.yml) using [OpenAPI Generator](https://openapi-generator.tech/).

> **Note**
> The client may look/behave odd because the Sched API violates some well established standards.
> <details><summary>List of violations</summary>
> 
> * Errors are (partially) returned with status code [``200 (OK)``](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/200)
> * ``text/html`` is used as [content type](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types#important_mime_types_for_web_developers) for plain text (should be ``text/plain``)
> * ``boolean`` is handled as ``"Y"``/``"N"`` or as ``"0"``/``"1"``
> * Numbers are (partially) handled as string
> * Dates are not formatted according to [``RFC 3339``](https://datatracker.ietf.org/doc/html/rfc3339)
> * Sometimes unix timestamps are used instead of dates
> * Arrays are not handled as arrays and instead comma separated lists are used
> * Some fields are not returned when using the 'Read-Only API Key' e.g. the ``id`` of users
> * Incorrect [HTTP Request methods](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods) are used. E.g. ``GET`` for  ``/api/session/del`` (should be ``DELETE``)
> * Some endpoints don't return JSON by default
> 
> </details>

#### API Support Status

<details><summary>Supported endpoints</summary>

* Site
  * Sync
* Session
  * Add ✔️
  * Modify ✔️
  * Delete ✔️
  * List ✔️
  * Export ✔️
  * Seats
  * Count
* User
  * List ✔️
  * Add ✔️
  * Modify ✔️
  * Get
  * Active
  * Avatar
  * Sessions
* Auth¹
  * Login
* Tag
  * Add
  * Modify
  * Delete
  * List
* Going¹
  * Add
  * Delete
  * Schedule
  * All
* Assets
  * Banner
* Role
  * Add ✔️
  * Delete ✔️
  * Export

¹ Handles `User Session Key`
</details>

## Installation
[Installation guide for the latest release](https://github.com/xdev-software/sched-java-client/releases/latest#Installation)

## Demo
A minimal demo is also available [here](./sched-java-client-demo/src/main/java/software/xdev/Application.java).

## Support
If you need support as soon as possible and you can't wait for any pull request, feel free to use [our support](https://xdev.software/en/services/support).

## Contributing
See the [contributing guide](./CONTRIBUTING.md) for detailed instructions on how to get started with our project.

## Dependencies and Licenses
View the [license of the current project](LICENSE) or the [summary including all dependencies](https://xdev-software.github.io/sched-java-client/dependencies/)
