// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateDnsZoneConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateDnsZoneConfigArgs Empty = new PrivateDnsZoneConfigArgs();

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="privateDnsZoneId")
    private final @Nullable Input<String> privateDnsZoneId;

    public Input<String> getPrivateDnsZoneId() {
        return this.privateDnsZoneId == null ? Input.empty() : this.privateDnsZoneId;
    }

    public PrivateDnsZoneConfigArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> privateDnsZoneId) {
        this.name = name;
        this.privateDnsZoneId = privateDnsZoneId;
    }

    private PrivateDnsZoneConfigArgs() {
        this.name = Input.empty();
        this.privateDnsZoneId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateDnsZoneConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> privateDnsZoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateDnsZoneConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.privateDnsZoneId = defaults.privateDnsZoneId;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPrivateDnsZoneId(@Nullable Input<String> privateDnsZoneId) {
            this.privateDnsZoneId = privateDnsZoneId;
            return this;
        }

        public Builder setPrivateDnsZoneId(@Nullable String privateDnsZoneId) {
            this.privateDnsZoneId = Input.ofNullable(privateDnsZoneId);
            return this;
        }

        public PrivateDnsZoneConfigArgs build() {
            return new PrivateDnsZoneConfigArgs(name, privateDnsZoneId);
        }
    }
}
