// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetListenerDefaultActionAuthenticateCognito extends io.pulumi.resources.InvokeArgs {

    public static final GetListenerDefaultActionAuthenticateCognito Empty = new GetListenerDefaultActionAuthenticateCognito();

    @Import(name="authenticationRequestExtraParams", required=true)
      private final Map<String,String> authenticationRequestExtraParams;

    public Map<String,String> getAuthenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams;
    }

    @Import(name="onUnauthenticatedRequest", required=true)
      private final String onUnauthenticatedRequest;

    public String getOnUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest;
    }

    @Import(name="scope", required=true)
      private final String scope;

    public String getScope() {
        return this.scope;
    }

    @Import(name="sessionCookieName", required=true)
      private final String sessionCookieName;

    public String getSessionCookieName() {
        return this.sessionCookieName;
    }

    @Import(name="sessionTimeout", required=true)
      private final Integer sessionTimeout;

    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    @Import(name="userPoolArn", required=true)
      private final String userPoolArn;

    public String getUserPoolArn() {
        return this.userPoolArn;
    }

    @Import(name="userPoolClientId", required=true)
      private final String userPoolClientId;

    public String getUserPoolClientId() {
        return this.userPoolClientId;
    }

    @Import(name="userPoolDomain", required=true)
      private final String userPoolDomain;

    public String getUserPoolDomain() {
        return this.userPoolDomain;
    }

    public GetListenerDefaultActionAuthenticateCognito(
        Map<String,String> authenticationRequestExtraParams,
        String onUnauthenticatedRequest,
        String scope,
        String sessionCookieName,
        Integer sessionTimeout,
        String userPoolArn,
        String userPoolClientId,
        String userPoolDomain) {
        this.authenticationRequestExtraParams = Objects.requireNonNull(authenticationRequestExtraParams, "expected parameter 'authenticationRequestExtraParams' to be non-null");
        this.onUnauthenticatedRequest = Objects.requireNonNull(onUnauthenticatedRequest, "expected parameter 'onUnauthenticatedRequest' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.sessionCookieName = Objects.requireNonNull(sessionCookieName, "expected parameter 'sessionCookieName' to be non-null");
        this.sessionTimeout = Objects.requireNonNull(sessionTimeout, "expected parameter 'sessionTimeout' to be non-null");
        this.userPoolArn = Objects.requireNonNull(userPoolArn, "expected parameter 'userPoolArn' to be non-null");
        this.userPoolClientId = Objects.requireNonNull(userPoolClientId, "expected parameter 'userPoolClientId' to be non-null");
        this.userPoolDomain = Objects.requireNonNull(userPoolDomain, "expected parameter 'userPoolDomain' to be non-null");
    }

    private GetListenerDefaultActionAuthenticateCognito() {
        this.authenticationRequestExtraParams = Map.of();
        this.onUnauthenticatedRequest = null;
        this.scope = null;
        this.sessionCookieName = null;
        this.sessionTimeout = null;
        this.userPoolArn = null;
        this.userPoolClientId = null;
        this.userPoolDomain = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionAuthenticateCognito defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> authenticationRequestExtraParams;
        private String onUnauthenticatedRequest;
        private String scope;
        private String sessionCookieName;
        private Integer sessionTimeout;
        private String userPoolArn;
        private String userPoolClientId;
        private String userPoolDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultActionAuthenticateCognito defaults) {
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

        public Builder authenticationRequestExtraParams(Map<String,String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = Objects.requireNonNull(authenticationRequestExtraParams);
            return this;
        }
        public Builder onUnauthenticatedRequest(String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = Objects.requireNonNull(onUnauthenticatedRequest);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder sessionCookieName(String sessionCookieName) {
            this.sessionCookieName = Objects.requireNonNull(sessionCookieName);
            return this;
        }
        public Builder sessionTimeout(Integer sessionTimeout) {
            this.sessionTimeout = Objects.requireNonNull(sessionTimeout);
            return this;
        }
        public Builder userPoolArn(String userPoolArn) {
            this.userPoolArn = Objects.requireNonNull(userPoolArn);
            return this;
        }
        public Builder userPoolClientId(String userPoolClientId) {
            this.userPoolClientId = Objects.requireNonNull(userPoolClientId);
            return this;
        }
        public Builder userPoolDomain(String userPoolDomain) {
            this.userPoolDomain = Objects.requireNonNull(userPoolDomain);
            return this;
        }        public GetListenerDefaultActionAuthenticateCognito build() {
            return new GetListenerDefaultActionAuthenticateCognito(authenticationRequestExtraParams, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, userPoolArn, userPoolClientId, userPoolDomain);
        }
    }
}
