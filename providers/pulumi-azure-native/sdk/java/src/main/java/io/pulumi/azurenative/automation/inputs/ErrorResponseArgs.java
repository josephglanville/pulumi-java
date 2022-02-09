// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ErrorResponseArgs extends io.pulumi.resources.ResourceArgs {

    public static final ErrorResponseArgs Empty = new ErrorResponseArgs();

    @InputImport(name="code")
    private final @Nullable Input<String> code;

    public Input<String> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    @InputImport(name="message")
    private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    public ErrorResponseArgs(
        @Nullable Input<String> code,
        @Nullable Input<String> message) {
        this.code = code;
        this.message = message;
    }

    private ErrorResponseArgs() {
        this.code = Input.empty();
        this.message = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> code;
        private @Nullable Input<String> message;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder setCode(@Nullable Input<String> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable String code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public ErrorResponseArgs build() {
            return new ErrorResponseArgs(code, message);
        }
    }
}
