### Improvements

- Plugin: clean up resources and exit cleanly on receiving SIGINT or CTRL_BREAK.
- Generated SDKs, use specialized `MissingRequiredPropertyException` rather than throwing `NullPointerException` when a required input property is missing.

### Bug Fixes