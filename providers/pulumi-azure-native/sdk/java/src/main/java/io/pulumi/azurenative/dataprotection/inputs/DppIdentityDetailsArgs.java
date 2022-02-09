// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DppIdentityDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DppIdentityDetailsArgs Empty = new DppIdentityDetailsArgs();

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public DppIdentityDetailsArgs(@Nullable Input<String> type) {
        this.type = type;
    }

    private DppIdentityDetailsArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DppIdentityDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DppIdentityDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public DppIdentityDetailsArgs build() {
            return new DppIdentityDetailsArgs(type);
        }
    }
}
