// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OperationErrorResponse {
    /**
     * Identifies the specific error that occurred.
     * 
     */
    private final String code;
    /**
     * This is always `sql#operationError`.
     * 
     */
    private final String kind;
    /**
     * Additional information about the error encountered.
     * 
     */
    private final String message;

    @CustomType.Constructor
    private OperationErrorResponse(
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("message") String message) {
        this.code = code;
        this.kind = kind;
        this.message = message;
    }

    /**
     * Identifies the specific error that occurred.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * This is always `sql#operationError`.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Additional information about the error encountered.
     * 
    */
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String kind;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.kind = defaults.kind;
    	      this.message = defaults.message;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public OperationErrorResponse build() {
            return new OperationErrorResponse(code, kind, message);
        }
    }
}
