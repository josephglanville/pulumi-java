// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConditionContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConditionContextArgs Empty = new ConditionContextArgs();

    @InputImport(name="accessTime")
    private final @Nullable Input<String> accessTime;

    public Input<String> getAccessTime() {
        return this.accessTime == null ? Input.empty() : this.accessTime;
    }

    public ConditionContextArgs(@Nullable Input<String> accessTime) {
        this.accessTime = accessTime;
    }

    private ConditionContextArgs() {
        this.accessTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTime = defaults.accessTime;
        }

        public Builder setAccessTime(@Nullable Input<String> accessTime) {
            this.accessTime = accessTime;
            return this;
        }

        public Builder setAccessTime(@Nullable String accessTime) {
            this.accessTime = Input.ofNullable(accessTime);
            return this;
        }

        public ConditionContextArgs build() {
            return new ConditionContextArgs(accessTime);
        }
    }
}