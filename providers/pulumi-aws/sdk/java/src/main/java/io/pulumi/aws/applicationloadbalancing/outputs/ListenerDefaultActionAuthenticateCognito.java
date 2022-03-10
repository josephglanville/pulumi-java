// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerDefaultActionAuthenticateCognito {
    /**
     * Query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
     */
    private final @Nullable Map<String,String> authenticationRequestExtraParams;
    /**
     * Behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
     */
    private final @Nullable String onUnauthenticatedRequest;
    /**
     * Set of user claims to be requested from the IdP.
     * 
     */
    private final @Nullable String scope;
    /**
     * Name of the cookie used to maintain session information.
     * 
     */
    private final @Nullable String sessionCookieName;
    /**
     * Maximum duration of the authentication session, in seconds.
     * 
     */
    private final @Nullable Integer sessionTimeout;
    /**
     * ARN of the Cognito user pool.
     * 
     */
    private final String userPoolArn;
    /**
     * ID of the Cognito user pool client.
     * 
     */
    private final String userPoolClientId;
    /**
     * Domain prefix or fully-qualified domain name of the Cognito user pool.
     * 
     */
    private final String userPoolDomain;

    @OutputCustomType.Constructor
    private ListenerDefaultActionAuthenticateCognito(
        @OutputCustomType.Parameter("authenticationRequestExtraParams") @Nullable Map<String,String> authenticationRequestExtraParams,
        @OutputCustomType.Parameter("onUnauthenticatedRequest") @Nullable String onUnauthenticatedRequest,
        @OutputCustomType.Parameter("scope") @Nullable String scope,
        @OutputCustomType.Parameter("sessionCookieName") @Nullable String sessionCookieName,
        @OutputCustomType.Parameter("sessionTimeout") @Nullable Integer sessionTimeout,
        @OutputCustomType.Parameter("userPoolArn") String userPoolArn,
        @OutputCustomType.Parameter("userPoolClientId") String userPoolClientId,
        @OutputCustomType.Parameter("userPoolDomain") String userPoolDomain) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        this.scope = scope;
        this.sessionCookieName = sessionCookieName;
        this.sessionTimeout = sessionTimeout;
        this.userPoolArn = userPoolArn;
        this.userPoolClientId = userPoolClientId;
        this.userPoolDomain = userPoolDomain;
    }

    /**
     * Query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
    */
    public Map<String,String> getAuthenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams == null ? Map.of() : this.authenticationRequestExtraParams;
    }
    /**
     * Behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
    */
    public Optional<String> getOnUnauthenticatedRequest() {
        return Optional.ofNullable(this.onUnauthenticatedRequest);
    }
    /**
     * Set of user claims to be requested from the IdP.
     * 
    */
    public Optional<String> getScope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * Name of the cookie used to maintain session information.
     * 
    */
    public Optional<String> getSessionCookieName() {
        return Optional.ofNullable(this.sessionCookieName);
    }
    /**
     * Maximum duration of the authentication session, in seconds.
     * 
    */
    public Optional<Integer> getSessionTimeout() {
        return Optional.ofNullable(this.sessionTimeout);
    }
    /**
     * ARN of the Cognito user pool.
     * 
    */
    public String getUserPoolArn() {
        return this.userPoolArn;
    }
    /**
     * ID of the Cognito user pool client.
     * 
    */
    public String getUserPoolClientId() {
        return this.userPoolClientId;
    }
    /**
     * Domain prefix or fully-qualified domain name of the Cognito user pool.
     * 
    */
    public String getUserPoolDomain() {
        return this.userPoolDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionAuthenticateCognito defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> authenticationRequestExtraParams;
        private @Nullable String onUnauthenticatedRequest;
        private @Nullable String scope;
        private @Nullable String sessionCookieName;
        private @Nullable Integer sessionTimeout;
        private String userPoolArn;
        private String userPoolClientId;
        private String userPoolDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionAuthenticateCognito defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationRequestExtraParams = defaults.authenticationRequestExtraParams;
    	      this.onUnauthenticatedRequest = defaults.onUnauthenticatedRequest;
    	      this.scope = defaults.scope;
    	      this.sessionCookieName = defaults.sessionCookieName;
    	      this.sessionTimeout = defaults.sessionTimeout;
    	      this.userPoolArn = defaults.userPoolArn;
    	      this.userPoolClientId = defaults.userPoolClientId;
    	      this.userPoolDomain = defaults.userPoolDomain;
        }

        public Builder setAuthenticationRequestExtraParams(@Nullable Map<String,String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }

        public Builder setOnUnauthenticatedRequest(@Nullable String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }

        public Builder setSessionCookieName(@Nullable String sessionCookieName) {
            this.sessionCookieName = sessionCookieName;
            return this;
        }

        public Builder setSessionTimeout(@Nullable Integer sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        public Builder setUserPoolArn(String userPoolArn) {
            this.userPoolArn = Objects.requireNonNull(userPoolArn);
            return this;
        }

        public Builder setUserPoolClientId(String userPoolClientId) {
            this.userPoolClientId = Objects.requireNonNull(userPoolClientId);
            return this;
        }

        public Builder setUserPoolDomain(String userPoolDomain) {
            this.userPoolDomain = Objects.requireNonNull(userPoolDomain);
            return this;
        }
        public ListenerDefaultActionAuthenticateCognito build() {
            return new ListenerDefaultActionAuthenticateCognito(authenticationRequestExtraParams, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, userPoolArn, userPoolClientId, userPoolDomain);
        }
    }
}
