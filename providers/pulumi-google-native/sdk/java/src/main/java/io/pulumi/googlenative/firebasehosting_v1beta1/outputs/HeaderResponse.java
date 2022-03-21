// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class HeaderResponse {
    /**
     * The user-supplied [glob](https://firebase.google.com/docs/hosting/full-config#glob_pattern_matching) to match against the request URL path.
     * 
     */
    private final String glob;
    /**
     * The additional headers to add to the response.
     * 
     */
    private final Map<String,String> headers;
    /**
     * The user-supplied RE2 regular expression to match against the request URL path.
     * 
     */
    private final String regex;

    @CustomType.Constructor
    private HeaderResponse(
        @CustomType.Parameter("glob") String glob,
        @CustomType.Parameter("headers") Map<String,String> headers,
        @CustomType.Parameter("regex") String regex) {
        this.glob = glob;
        this.headers = headers;
        this.regex = regex;
    }

    /**
     * The user-supplied [glob](https://firebase.google.com/docs/hosting/full-config#glob_pattern_matching) to match against the request URL path.
     * 
    */
    public String getGlob() {
        return this.glob;
    }
    /**
     * The additional headers to add to the response.
     * 
    */
    public Map<String,String> getHeaders() {
        return this.headers;
    }
    /**
     * The user-supplied RE2 regular expression to match against the request URL path.
     * 
    */
    public String getRegex() {
        return this.regex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HeaderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String glob;
        private Map<String,String> headers;
        private String regex;

        public Builder() {
    	      // Empty
        }

        public Builder(HeaderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.glob = defaults.glob;
    	      this.headers = defaults.headers;
    	      this.regex = defaults.regex;
        }

        public Builder glob(String glob) {
            this.glob = Objects.requireNonNull(glob);
            return this;
        }
        public Builder headers(Map<String,String> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }
        public Builder regex(String regex) {
            this.regex = Objects.requireNonNull(regex);
            return this;
        }        public HeaderResponse build() {
            return new HeaderResponse(glob, headers, regex);
        }
    }
}
