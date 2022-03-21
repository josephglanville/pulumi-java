// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBackendServiceCdnPolicyCacheKeyPolicy {
    private final Boolean includeHost;
    private final Boolean includeProtocol;
    private final Boolean includeQueryString;
    private final List<String> queryStringBlacklists;
    private final List<String> queryStringWhitelists;

    @CustomType.Constructor
    private GetBackendServiceCdnPolicyCacheKeyPolicy(
        @CustomType.Parameter("includeHost") Boolean includeHost,
        @CustomType.Parameter("includeProtocol") Boolean includeProtocol,
        @CustomType.Parameter("includeQueryString") Boolean includeQueryString,
        @CustomType.Parameter("queryStringBlacklists") List<String> queryStringBlacklists,
        @CustomType.Parameter("queryStringWhitelists") List<String> queryStringWhitelists) {
        this.includeHost = includeHost;
        this.includeProtocol = includeProtocol;
        this.includeQueryString = includeQueryString;
        this.queryStringBlacklists = queryStringBlacklists;
        this.queryStringWhitelists = queryStringWhitelists;
    }

    public Boolean getIncludeHost() {
        return this.includeHost;
    }
    public Boolean getIncludeProtocol() {
        return this.includeProtocol;
    }
    public Boolean getIncludeQueryString() {
        return this.includeQueryString;
    }
    public List<String> getQueryStringBlacklists() {
        return this.queryStringBlacklists;
    }
    public List<String> getQueryStringWhitelists() {
        return this.queryStringWhitelists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceCdnPolicyCacheKeyPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean includeHost;
        private Boolean includeProtocol;
        private Boolean includeQueryString;
        private List<String> queryStringBlacklists;
        private List<String> queryStringWhitelists;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceCdnPolicyCacheKeyPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeHost = defaults.includeHost;
    	      this.includeProtocol = defaults.includeProtocol;
    	      this.includeQueryString = defaults.includeQueryString;
    	      this.queryStringBlacklists = defaults.queryStringBlacklists;
    	      this.queryStringWhitelists = defaults.queryStringWhitelists;
        }

        public Builder includeHost(Boolean includeHost) {
            this.includeHost = Objects.requireNonNull(includeHost);
            return this;
        }
        public Builder includeProtocol(Boolean includeProtocol) {
            this.includeProtocol = Objects.requireNonNull(includeProtocol);
            return this;
        }
        public Builder includeQueryString(Boolean includeQueryString) {
            this.includeQueryString = Objects.requireNonNull(includeQueryString);
            return this;
        }
        public Builder queryStringBlacklists(List<String> queryStringBlacklists) {
            this.queryStringBlacklists = Objects.requireNonNull(queryStringBlacklists);
            return this;
        }
        public Builder queryStringBlacklists(String... queryStringBlacklists) {
            return queryStringBlacklists(List.of(queryStringBlacklists));
        }
        public Builder queryStringWhitelists(List<String> queryStringWhitelists) {
            this.queryStringWhitelists = Objects.requireNonNull(queryStringWhitelists);
            return this;
        }
        public Builder queryStringWhitelists(String... queryStringWhitelists) {
            return queryStringWhitelists(List.of(queryStringWhitelists));
        }        public GetBackendServiceCdnPolicyCacheKeyPolicy build() {
            return new GetBackendServiceCdnPolicyCacheKeyPolicy(includeHost, includeProtocol, includeQueryString, queryStringBlacklists, queryStringWhitelists);
        }
    }
}
