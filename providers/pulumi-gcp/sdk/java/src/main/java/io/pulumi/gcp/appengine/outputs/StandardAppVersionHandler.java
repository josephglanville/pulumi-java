// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.appengine.outputs.StandardAppVersionHandlerScript;
import io.pulumi.gcp.appengine.outputs.StandardAppVersionHandlerStaticFiles;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StandardAppVersionHandler {
    /**
     * Actions to take when the user is not logged in.
     * Possible values are `AUTH_FAIL_ACTION_REDIRECT` and `AUTH_FAIL_ACTION_UNAUTHORIZED`.
     * 
     */
    private final @Nullable String authFailAction;
    /**
     * Methods to restrict access to a URL based on login status.
     * Possible values are `LOGIN_OPTIONAL`, `LOGIN_ADMIN`, and `LOGIN_REQUIRED`.
     * 
     */
    private final @Nullable String login;
    /**
     * 30x code to use when performing redirects for the secure field.
     * Possible values are `REDIRECT_HTTP_RESPONSE_CODE_301`, `REDIRECT_HTTP_RESPONSE_CODE_302`, `REDIRECT_HTTP_RESPONSE_CODE_303`, and `REDIRECT_HTTP_RESPONSE_CODE_307`.
     * 
     */
    private final @Nullable String redirectHttpResponseCode;
    /**
     * Executes a script to handle the requests that match this URL pattern.
     * Only the auto value is supported for Node.js in the App Engine standard environment, for example "script:" "auto".
     * Structure is documented below.
     * 
     */
    private final @Nullable StandardAppVersionHandlerScript script;
    /**
     * Security (HTTPS) enforcement for this URL.
     * Possible values are `SECURE_DEFAULT`, `SECURE_NEVER`, `SECURE_OPTIONAL`, and `SECURE_ALWAYS`.
     * 
     */
    private final @Nullable String securityLevel;
    /**
     * Files served directly to the user for a given URL, such as images, CSS stylesheets, or JavaScript source files. Static file handlers describe which files in the application directory are static files, and which URLs serve them.
     * Structure is documented below.
     * 
     */
    private final @Nullable StandardAppVersionHandlerStaticFiles staticFiles;
    /**
     * URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings.
     * All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
     */
    private final @Nullable String urlRegex;

    @CustomType.Constructor
    private StandardAppVersionHandler(
        @CustomType.Parameter("authFailAction") @Nullable String authFailAction,
        @CustomType.Parameter("login") @Nullable String login,
        @CustomType.Parameter("redirectHttpResponseCode") @Nullable String redirectHttpResponseCode,
        @CustomType.Parameter("script") @Nullable StandardAppVersionHandlerScript script,
        @CustomType.Parameter("securityLevel") @Nullable String securityLevel,
        @CustomType.Parameter("staticFiles") @Nullable StandardAppVersionHandlerStaticFiles staticFiles,
        @CustomType.Parameter("urlRegex") @Nullable String urlRegex) {
        this.authFailAction = authFailAction;
        this.login = login;
        this.redirectHttpResponseCode = redirectHttpResponseCode;
        this.script = script;
        this.securityLevel = securityLevel;
        this.staticFiles = staticFiles;
        this.urlRegex = urlRegex;
    }

    /**
     * Actions to take when the user is not logged in.
     * Possible values are `AUTH_FAIL_ACTION_REDIRECT` and `AUTH_FAIL_ACTION_UNAUTHORIZED`.
     * 
    */
    public Optional<String> getAuthFailAction() {
        return Optional.ofNullable(this.authFailAction);
    }
    /**
     * Methods to restrict access to a URL based on login status.
     * Possible values are `LOGIN_OPTIONAL`, `LOGIN_ADMIN`, and `LOGIN_REQUIRED`.
     * 
    */
    public Optional<String> getLogin() {
        return Optional.ofNullable(this.login);
    }
    /**
     * 30x code to use when performing redirects for the secure field.
     * Possible values are `REDIRECT_HTTP_RESPONSE_CODE_301`, `REDIRECT_HTTP_RESPONSE_CODE_302`, `REDIRECT_HTTP_RESPONSE_CODE_303`, and `REDIRECT_HTTP_RESPONSE_CODE_307`.
     * 
    */
    public Optional<String> getRedirectHttpResponseCode() {
        return Optional.ofNullable(this.redirectHttpResponseCode);
    }
    /**
     * Executes a script to handle the requests that match this URL pattern.
     * Only the auto value is supported for Node.js in the App Engine standard environment, for example "script:" "auto".
     * Structure is documented below.
     * 
    */
    public Optional<StandardAppVersionHandlerScript> getScript() {
        return Optional.ofNullable(this.script);
    }
    /**
     * Security (HTTPS) enforcement for this URL.
     * Possible values are `SECURE_DEFAULT`, `SECURE_NEVER`, `SECURE_OPTIONAL`, and `SECURE_ALWAYS`.
     * 
    */
    public Optional<String> getSecurityLevel() {
        return Optional.ofNullable(this.securityLevel);
    }
    /**
     * Files served directly to the user for a given URL, such as images, CSS stylesheets, or JavaScript source files. Static file handlers describe which files in the application directory are static files, and which URLs serve them.
     * Structure is documented below.
     * 
    */
    public Optional<StandardAppVersionHandlerStaticFiles> getStaticFiles() {
        return Optional.ofNullable(this.staticFiles);
    }
    /**
     * URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings.
     * All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
    */
    public Optional<String> getUrlRegex() {
        return Optional.ofNullable(this.urlRegex);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionHandler defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authFailAction;
        private @Nullable String login;
        private @Nullable String redirectHttpResponseCode;
        private @Nullable StandardAppVersionHandlerScript script;
        private @Nullable String securityLevel;
        private @Nullable StandardAppVersionHandlerStaticFiles staticFiles;
        private @Nullable String urlRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionHandler defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authFailAction = defaults.authFailAction;
    	      this.login = defaults.login;
    	      this.redirectHttpResponseCode = defaults.redirectHttpResponseCode;
    	      this.script = defaults.script;
    	      this.securityLevel = defaults.securityLevel;
    	      this.staticFiles = defaults.staticFiles;
    	      this.urlRegex = defaults.urlRegex;
        }

        public Builder authFailAction(@Nullable String authFailAction) {
            this.authFailAction = authFailAction;
            return this;
        }
        public Builder login(@Nullable String login) {
            this.login = login;
            return this;
        }
        public Builder redirectHttpResponseCode(@Nullable String redirectHttpResponseCode) {
            this.redirectHttpResponseCode = redirectHttpResponseCode;
            return this;
        }
        public Builder script(@Nullable StandardAppVersionHandlerScript script) {
            this.script = script;
            return this;
        }
        public Builder securityLevel(@Nullable String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Builder staticFiles(@Nullable StandardAppVersionHandlerStaticFiles staticFiles) {
            this.staticFiles = staticFiles;
            return this;
        }
        public Builder urlRegex(@Nullable String urlRegex) {
            this.urlRegex = urlRegex;
            return this;
        }        public StandardAppVersionHandler build() {
            return new StandardAppVersionHandler(authFailAction, login, redirectHttpResponseCode, script, securityLevel, staticFiles, urlRegex);
        }
    }
}
