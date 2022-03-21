// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CacheKeyPolicyResponse {
    /**
     * If true, requests to different hosts will be cached separately.
     * 
     */
    private final Boolean includeHost;
    /**
     * Allows HTTP request headers (by name) to be used in the cache key.
     * 
     */
    private final List<String> includeHttpHeaders;
    /**
     * Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in the cache key Cloud CDN generates.
     * 
     */
    private final List<String> includeNamedCookies;
    /**
     * If true, http and https requests will be cached separately.
     * 
     */
    private final Boolean includeProtocol;
    /**
     * If true, include query string parameters in the cache key according to query_string_whitelist and query_string_blacklist. If neither is set, the entire query string will be included. If false, the query string will be excluded from the cache key entirely.
     * 
     */
    private final Boolean includeQueryString;
    /**
     * Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
     */
    private final List<String> queryStringBlacklist;
    /**
     * Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
     */
    private final List<String> queryStringWhitelist;

    @CustomType.Constructor
    private CacheKeyPolicyResponse(
        @CustomType.Parameter("includeHost") Boolean includeHost,
        @CustomType.Parameter("includeHttpHeaders") List<String> includeHttpHeaders,
        @CustomType.Parameter("includeNamedCookies") List<String> includeNamedCookies,
        @CustomType.Parameter("includeProtocol") Boolean includeProtocol,
        @CustomType.Parameter("includeQueryString") Boolean includeQueryString,
        @CustomType.Parameter("queryStringBlacklist") List<String> queryStringBlacklist,
        @CustomType.Parameter("queryStringWhitelist") List<String> queryStringWhitelist) {
        this.includeHost = includeHost;
        this.includeHttpHeaders = includeHttpHeaders;
        this.includeNamedCookies = includeNamedCookies;
        this.includeProtocol = includeProtocol;
        this.includeQueryString = includeQueryString;
        this.queryStringBlacklist = queryStringBlacklist;
        this.queryStringWhitelist = queryStringWhitelist;
    }

    /**
     * If true, requests to different hosts will be cached separately.
     * 
    */
    public Boolean getIncludeHost() {
        return this.includeHost;
    }
    /**
     * Allows HTTP request headers (by name) to be used in the cache key.
     * 
    */
    public List<String> getIncludeHttpHeaders() {
        return this.includeHttpHeaders;
    }
    /**
     * Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in the cache key Cloud CDN generates.
     * 
    */
    public List<String> getIncludeNamedCookies() {
        return this.includeNamedCookies;
    }
    /**
     * If true, http and https requests will be cached separately.
     * 
    */
    public Boolean getIncludeProtocol() {
        return this.includeProtocol;
    }
    /**
     * If true, include query string parameters in the cache key according to query_string_whitelist and query_string_blacklist. If neither is set, the entire query string will be included. If false, the query string will be excluded from the cache key entirely.
     * 
    */
    public Boolean getIncludeQueryString() {
        return this.includeQueryString;
    }
    /**
     * Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
    */
    public List<String> getQueryStringBlacklist() {
        return this.queryStringBlacklist;
    }
    /**
     * Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
    */
    public List<String> getQueryStringWhitelist() {
        return this.queryStringWhitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheKeyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean includeHost;
        private List<String> includeHttpHeaders;
        private List<String> includeNamedCookies;
        private Boolean includeProtocol;
        private Boolean includeQueryString;
        private List<String> queryStringBlacklist;
        private List<String> queryStringWhitelist;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheKeyPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeHost = defaults.includeHost;
    	      this.includeHttpHeaders = defaults.includeHttpHeaders;
    	      this.includeNamedCookies = defaults.includeNamedCookies;
    	      this.includeProtocol = defaults.includeProtocol;
    	      this.includeQueryString = defaults.includeQueryString;
    	      this.queryStringBlacklist = defaults.queryStringBlacklist;
    	      this.queryStringWhitelist = defaults.queryStringWhitelist;
        }

        public Builder includeHost(Boolean includeHost) {
            this.includeHost = Objects.requireNonNull(includeHost);
            return this;
        }
        public Builder includeHttpHeaders(List<String> includeHttpHeaders) {
            this.includeHttpHeaders = Objects.requireNonNull(includeHttpHeaders);
            return this;
        }
        public Builder includeHttpHeaders(String... includeHttpHeaders) {
            return includeHttpHeaders(List.of(includeHttpHeaders));
        }
        public Builder includeNamedCookies(List<String> includeNamedCookies) {
            this.includeNamedCookies = Objects.requireNonNull(includeNamedCookies);
            return this;
        }
        public Builder includeNamedCookies(String... includeNamedCookies) {
            return includeNamedCookies(List.of(includeNamedCookies));
        }
        public Builder includeProtocol(Boolean includeProtocol) {
            this.includeProtocol = Objects.requireNonNull(includeProtocol);
            return this;
        }
        public Builder includeQueryString(Boolean includeQueryString) {
            this.includeQueryString = Objects.requireNonNull(includeQueryString);
            return this;
        }
        public Builder queryStringBlacklist(List<String> queryStringBlacklist) {
            this.queryStringBlacklist = Objects.requireNonNull(queryStringBlacklist);
            return this;
        }
        public Builder queryStringBlacklist(String... queryStringBlacklist) {
            return queryStringBlacklist(List.of(queryStringBlacklist));
        }
        public Builder queryStringWhitelist(List<String> queryStringWhitelist) {
            this.queryStringWhitelist = Objects.requireNonNull(queryStringWhitelist);
            return this;
        }
        public Builder queryStringWhitelist(String... queryStringWhitelist) {
            return queryStringWhitelist(List.of(queryStringWhitelist));
        }        public CacheKeyPolicyResponse build() {
            return new CacheKeyPolicyResponse(includeHost, includeHttpHeaders, includeNamedCookies, includeProtocol, includeQueryString, queryStringBlacklist, queryStringWhitelist);
        }
    }
}
