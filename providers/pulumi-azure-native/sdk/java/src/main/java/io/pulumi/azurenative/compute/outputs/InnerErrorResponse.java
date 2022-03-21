// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InnerErrorResponse {
    /**
     * The internal error message or exception dump.
     * 
     */
    private final @Nullable String errordetail;
    /**
     * The exception type.
     * 
     */
    private final @Nullable String exceptiontype;

    @CustomType.Constructor
    private InnerErrorResponse(
        @CustomType.Parameter("errordetail") @Nullable String errordetail,
        @CustomType.Parameter("exceptiontype") @Nullable String exceptiontype) {
        this.errordetail = errordetail;
        this.exceptiontype = exceptiontype;
    }

    /**
     * The internal error message or exception dump.
     * 
    */
    public Optional<String> getErrordetail() {
        return Optional.ofNullable(this.errordetail);
    }
    /**
     * The exception type.
     * 
    */
    public Optional<String> getExceptiontype() {
        return Optional.ofNullable(this.exceptiontype);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InnerErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String errordetail;
        private @Nullable String exceptiontype;

        public Builder() {
    	      // Empty
        }

        public Builder(InnerErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errordetail = defaults.errordetail;
    	      this.exceptiontype = defaults.exceptiontype;
        }

        public Builder errordetail(@Nullable String errordetail) {
            this.errordetail = errordetail;
            return this;
        }
        public Builder exceptiontype(@Nullable String exceptiontype) {
            this.exceptiontype = exceptiontype;
            return this;
        }        public InnerErrorResponse build() {
            return new InnerErrorResponse(errordetail, exceptiontype);
        }
    }
}
