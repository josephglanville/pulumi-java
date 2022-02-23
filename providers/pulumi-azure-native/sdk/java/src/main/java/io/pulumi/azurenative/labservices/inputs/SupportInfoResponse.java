// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Support contact information and instructions.
 * 
 */
public final class SupportInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final SupportInfoResponse Empty = new SupportInfoResponse();

    /**
     * Support contact email address.
     * 
     */
    @InputImport(name="email")
      private final @Nullable String email;

    public Optional<String> getEmail() {
        return this.email == null ? Optional.empty() : Optional.ofNullable(this.email);
    }

    /**
     * Support instructions.
     * 
     */
    @InputImport(name="instructions")
      private final @Nullable String instructions;

    public Optional<String> getInstructions() {
        return this.instructions == null ? Optional.empty() : Optional.ofNullable(this.instructions);
    }

    /**
     * Support contact phone number.
     * 
     */
    @InputImport(name="phone")
      private final @Nullable String phone;

    public Optional<String> getPhone() {
        return this.phone == null ? Optional.empty() : Optional.ofNullable(this.phone);
    }

    /**
     * Support web address.
     * 
     */
    @InputImport(name="url")
      private final @Nullable String url;

    public Optional<String> getUrl() {
        return this.url == null ? Optional.empty() : Optional.ofNullable(this.url);
    }

    public SupportInfoResponse(
        @Nullable String email,
        @Nullable String instructions,
        @Nullable String phone,
        @Nullable String url) {
        this.email = email;
        this.instructions = instructions;
        this.phone = phone;
        this.url = url;
    }

    private SupportInfoResponse() {
        this.email = null;
        this.instructions = null;
        this.phone = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SupportInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String email;
        private @Nullable String instructions;
        private @Nullable String phone;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(SupportInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.instructions = defaults.instructions;
    	      this.phone = defaults.phone;
    	      this.url = defaults.url;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = email;
            return this;
        }

        public Builder setInstructions(@Nullable String instructions) {
            this.instructions = instructions;
            return this;
        }

        public Builder setPhone(@Nullable String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }
        public SupportInfoResponse build() {
            return new SupportInfoResponse(email, instructions, phone, url);
        }
    }
}
