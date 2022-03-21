// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.inputs.SslPolicyWarningsItemDataItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SslPolicyWarningsItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final SslPolicyWarningsItemResponse Empty = new SslPolicyWarningsItemResponse();

    /**
     * A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
     * 
     */
    @Import(name="code", required=true)
      private final String code;

    public String getCode() {
        return this.code;
    }

    /**
     * Metadata about this warning in key: value format. For example: "data": [ { "key": "scope", "value": "zones/us-east1-d" }
     * 
     */
    @Import(name="data", required=true)
      private final List<SslPolicyWarningsItemDataItemResponse> data;

    public List<SslPolicyWarningsItemDataItemResponse> getData() {
        return this.data;
    }

    /**
     * A human-readable description of the warning code.
     * 
     */
    @Import(name="message", required=true)
      private final String message;

    public String getMessage() {
        return this.message;
    }

    public SslPolicyWarningsItemResponse(
        String code,
        List<SslPolicyWarningsItemDataItemResponse> data,
        String message) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.data = Objects.requireNonNull(data, "expected parameter 'data' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
    }

    private SslPolicyWarningsItemResponse() {
        this.code = null;
        this.data = List.of();
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslPolicyWarningsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private List<SslPolicyWarningsItemDataItemResponse> data;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(SslPolicyWarningsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.data = defaults.data;
    	      this.message = defaults.message;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder data(List<SslPolicyWarningsItemDataItemResponse> data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder data(SslPolicyWarningsItemDataItemResponse... data) {
            return data(List.of(data));
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public SslPolicyWarningsItemResponse build() {
            return new SslPolicyWarningsItemResponse(code, data, message);
        }
    }
}
