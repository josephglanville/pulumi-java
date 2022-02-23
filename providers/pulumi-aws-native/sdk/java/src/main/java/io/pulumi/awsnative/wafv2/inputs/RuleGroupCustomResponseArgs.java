// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupCustomHTTPHeaderArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Custom response.
 * 
 */
public final class RuleGroupCustomResponseArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupCustomResponseArgs Empty = new RuleGroupCustomResponseArgs();

    /**
     * Custom response body key.
     * 
     */
    @InputImport(name="customResponseBodyKey")
      private final @Nullable Input<String> customResponseBodyKey;

    public Input<String> getCustomResponseBodyKey() {
        return this.customResponseBodyKey == null ? Input.empty() : this.customResponseBodyKey;
    }

    @InputImport(name="responseCode", required=true)
      private final Input<Integer> responseCode;

    public Input<Integer> getResponseCode() {
        return this.responseCode;
    }

    /**
     * Collection of HTTP headers.
     * 
     */
    @InputImport(name="responseHeaders")
      private final @Nullable Input<List<RuleGroupCustomHTTPHeaderArgs>> responseHeaders;

    public Input<List<RuleGroupCustomHTTPHeaderArgs>> getResponseHeaders() {
        return this.responseHeaders == null ? Input.empty() : this.responseHeaders;
    }

    public RuleGroupCustomResponseArgs(
        @Nullable Input<String> customResponseBodyKey,
        Input<Integer> responseCode,
        @Nullable Input<List<RuleGroupCustomHTTPHeaderArgs>> responseHeaders) {
        this.customResponseBodyKey = customResponseBodyKey;
        this.responseCode = Objects.requireNonNull(responseCode, "expected parameter 'responseCode' to be non-null");
        this.responseHeaders = responseHeaders;
    }

    private RuleGroupCustomResponseArgs() {
        this.customResponseBodyKey = Input.empty();
        this.responseCode = Input.empty();
        this.responseHeaders = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupCustomResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customResponseBodyKey;
        private Input<Integer> responseCode;
        private @Nullable Input<List<RuleGroupCustomHTTPHeaderArgs>> responseHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupCustomResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponseBodyKey = defaults.customResponseBodyKey;
    	      this.responseCode = defaults.responseCode;
    	      this.responseHeaders = defaults.responseHeaders;
        }

        public Builder setCustomResponseBodyKey(@Nullable Input<String> customResponseBodyKey) {
            this.customResponseBodyKey = customResponseBodyKey;
            return this;
        }

        public Builder setCustomResponseBodyKey(@Nullable String customResponseBodyKey) {
            this.customResponseBodyKey = Input.ofNullable(customResponseBodyKey);
            return this;
        }

        public Builder setResponseCode(Input<Integer> responseCode) {
            this.responseCode = Objects.requireNonNull(responseCode);
            return this;
        }

        public Builder setResponseCode(Integer responseCode) {
            this.responseCode = Input.of(Objects.requireNonNull(responseCode));
            return this;
        }

        public Builder setResponseHeaders(@Nullable Input<List<RuleGroupCustomHTTPHeaderArgs>> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }

        public Builder setResponseHeaders(@Nullable List<RuleGroupCustomHTTPHeaderArgs> responseHeaders) {
            this.responseHeaders = Input.ofNullable(responseHeaders);
            return this;
        }
        public RuleGroupCustomResponseArgs build() {
            return new RuleGroupCustomResponseArgs(customResponseBodyKey, responseCode, responseHeaders);
        }
    }
}
