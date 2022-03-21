// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.apps_v1beta1.outputs.RollingUpdateStatefulSetStrategy;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatefulSetUpdateStrategy {
    /**
     * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
     * 
     */
    private final @Nullable RollingUpdateStatefulSetStrategy rollingUpdate;
    /**
     * Type indicates the type of the StatefulSetUpdateStrategy.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private StatefulSetUpdateStrategy(
        @CustomType.Parameter("rollingUpdate") @Nullable RollingUpdateStatefulSetStrategy rollingUpdate,
        @CustomType.Parameter("type") @Nullable String type) {
        this.rollingUpdate = rollingUpdate;
        this.type = type;
    }

    /**
     * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
     * 
    */
    public Optional<RollingUpdateStatefulSetStrategy> getRollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }
    /**
     * Type indicates the type of the StatefulSetUpdateStrategy.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetUpdateStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RollingUpdateStatefulSetStrategy rollingUpdate;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSetUpdateStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.type = defaults.type;
        }

        public Builder rollingUpdate(@Nullable RollingUpdateStatefulSetStrategy rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public StatefulSetUpdateStrategy build() {
            return new StatefulSetUpdateStrategy(rollingUpdate, type);
        }
    }
}
