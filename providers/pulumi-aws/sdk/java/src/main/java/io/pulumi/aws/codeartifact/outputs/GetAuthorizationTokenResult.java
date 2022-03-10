// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codeartifact.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAuthorizationTokenResult {
    /**
     * Temporary authorization token.
     * 
     */
    private final String authorizationToken;
    private final String domain;
    private final String domainOwner;
    private final @Nullable Integer durationSeconds;
    /**
     * The time in UTC RFC3339 format when the authorization token expires.
     * 
     */
    private final String expiration;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @OutputCustomType.Constructor
    private GetAuthorizationTokenResult(
        @OutputCustomType.Parameter("authorizationToken") String authorizationToken,
        @OutputCustomType.Parameter("domain") String domain,
        @OutputCustomType.Parameter("domainOwner") String domainOwner,
        @OutputCustomType.Parameter("durationSeconds") @Nullable Integer durationSeconds,
        @OutputCustomType.Parameter("expiration") String expiration,
        @OutputCustomType.Parameter("id") String id) {
        this.authorizationToken = authorizationToken;
        this.domain = domain;
        this.domainOwner = domainOwner;
        this.durationSeconds = durationSeconds;
        this.expiration = expiration;
        this.id = id;
    }

    /**
     * Temporary authorization token.
     * 
    */
    public String getAuthorizationToken() {
        return this.authorizationToken;
    }
    public String getDomain() {
        return this.domain;
    }
    public String getDomainOwner() {
        return this.domainOwner;
    }
    public Optional<Integer> getDurationSeconds() {
        return Optional.ofNullable(this.durationSeconds);
    }
    /**
     * The time in UTC RFC3339 format when the authorization token expires.
     * 
    */
    public String getExpiration() {
        return this.expiration;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizationTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationToken;
        private String domain;
        private String domainOwner;
        private @Nullable Integer durationSeconds;
        private String expiration;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuthorizationTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationToken = defaults.authorizationToken;
    	      this.domain = defaults.domain;
    	      this.domainOwner = defaults.domainOwner;
    	      this.durationSeconds = defaults.durationSeconds;
    	      this.expiration = defaults.expiration;
    	      this.id = defaults.id;
        }

        public Builder setAuthorizationToken(String authorizationToken) {
            this.authorizationToken = Objects.requireNonNull(authorizationToken);
            return this;
        }

        public Builder setDomain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder setDomainOwner(String domainOwner) {
            this.domainOwner = Objects.requireNonNull(domainOwner);
            return this;
        }

        public Builder setDurationSeconds(@Nullable Integer durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }

        public Builder setExpiration(String expiration) {
            this.expiration = Objects.requireNonNull(expiration);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetAuthorizationTokenResult build() {
            return new GetAuthorizationTokenResult(authorizationToken, domain, domainOwner, durationSeconds, expiration, id);
        }
    }
}
