// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SupportInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final SupportInfoArgs Empty = new SupportInfoArgs();

    @InputImport(name="email")
    private final @Nullable Input<String> email;

    public Input<String> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    @InputImport(name="instructions")
    private final @Nullable Input<String> instructions;

    public Input<String> getInstructions() {
        return this.instructions == null ? Input.empty() : this.instructions;
    }

    @InputImport(name="phone")
    private final @Nullable Input<String> phone;

    public Input<String> getPhone() {
        return this.phone == null ? Input.empty() : this.phone;
    }

    @InputImport(name="url")
    private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public SupportInfoArgs(
        @Nullable Input<String> email,
        @Nullable Input<String> instructions,
        @Nullable Input<String> phone,
        @Nullable Input<String> url) {
        this.email = email;
        this.instructions = instructions;
        this.phone = phone;
        this.url = url;
    }

    private SupportInfoArgs() {
        this.email = Input.empty();
        this.instructions = Input.empty();
        this.phone = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SupportInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> email;
        private @Nullable Input<String> instructions;
        private @Nullable Input<String> phone;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(SupportInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.instructions = defaults.instructions;
    	      this.phone = defaults.phone;
    	      this.url = defaults.url;
        }

        public Builder setEmail(@Nullable Input<String> email) {
            this.email = email;
            return this;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder setInstructions(@Nullable Input<String> instructions) {
            this.instructions = instructions;
            return this;
        }

        public Builder setInstructions(@Nullable String instructions) {
            this.instructions = Input.ofNullable(instructions);
            return this;
        }

        public Builder setPhone(@Nullable Input<String> phone) {
            this.phone = phone;
            return this;
        }

        public Builder setPhone(@Nullable String phone) {
            this.phone = Input.ofNullable(phone);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public SupportInfoArgs build() {
            return new SupportInfoArgs(email, instructions, phone, url);
        }
    }
}
