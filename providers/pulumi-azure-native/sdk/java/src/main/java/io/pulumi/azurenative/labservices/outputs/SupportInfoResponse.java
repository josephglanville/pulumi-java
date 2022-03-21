// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SupportInfoResponse {
    /**
     * Support contact email address.
     * 
     */
    private final @Nullable String email;
    /**
     * Support instructions.
     * 
     */
    private final @Nullable String instructions;
    /**
     * Support contact phone number.
     * 
     */
    private final @Nullable String phone;
    /**
     * Support web address.
     * 
     */
    private final @Nullable String url;

    @CustomType.Constructor
    private SupportInfoResponse(
        @CustomType.Parameter("email") @Nullable String email,
        @CustomType.Parameter("instructions") @Nullable String instructions,
        @CustomType.Parameter("phone") @Nullable String phone,
        @CustomType.Parameter("url") @Nullable String url) {
        this.email = email;
        this.instructions = instructions;
        this.phone = phone;
        this.url = url;
    }

    /**
     * Support contact email address.
     * 
    */
    public Optional<String> getEmail() {
        return Optional.ofNullable(this.email);
    }
    /**
     * Support instructions.
     * 
    */
    public Optional<String> getInstructions() {
        return Optional.ofNullable(this.instructions);
    }
    /**
     * Support contact phone number.
     * 
    */
    public Optional<String> getPhone() {
        return Optional.ofNullable(this.phone);
    }
    /**
     * Support web address.
     * 
    */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
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

        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        public Builder instructions(@Nullable String instructions) {
            this.instructions = instructions;
            return this;
        }
        public Builder phone(@Nullable String phone) {
            this.phone = phone;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }        public SupportInfoResponse build() {
            return new SupportInfoResponse(email, instructions, phone, url);
        }
    }
}
