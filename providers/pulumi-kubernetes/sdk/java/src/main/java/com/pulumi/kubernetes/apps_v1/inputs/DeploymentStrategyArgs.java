// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.apps_v1.inputs.RollingUpdateDeploymentArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DeploymentStrategy describes how to replace existing pods with new ones.
 * 
 */
public final class DeploymentStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentStrategyArgs Empty = new DeploymentStrategyArgs();

    /**
     * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
     * 
     */
    @Import(name="rollingUpdate")
    private @Nullable Output<RollingUpdateDeploymentArgs> rollingUpdate;

    /**
     * @return Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
     * 
     */
    public Optional<Output<RollingUpdateDeploymentArgs>> rollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }

    /**
     * Type of deployment. Can be &#34;Recreate&#34; or &#34;RollingUpdate&#34;. Default is RollingUpdate.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of deployment. Can be &#34;Recreate&#34; or &#34;RollingUpdate&#34;. Default is RollingUpdate.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DeploymentStrategyArgs() {}

    private DeploymentStrategyArgs(DeploymentStrategyArgs $) {
        this.rollingUpdate = $.rollingUpdate;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentStrategyArgs $;

        public Builder() {
            $ = new DeploymentStrategyArgs();
        }

        public Builder(DeploymentStrategyArgs defaults) {
            $ = new DeploymentStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rollingUpdate Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
         * 
         * @return builder
         * 
         */
        public Builder rollingUpdate(@Nullable Output<RollingUpdateDeploymentArgs> rollingUpdate) {
            $.rollingUpdate = rollingUpdate;
            return this;
        }

        /**
         * @param rollingUpdate Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
         * 
         * @return builder
         * 
         */
        public Builder rollingUpdate(RollingUpdateDeploymentArgs rollingUpdate) {
            return rollingUpdate(Output.of(rollingUpdate));
        }

        /**
         * @param type Type of deployment. Can be &#34;Recreate&#34; or &#34;RollingUpdate&#34;. Default is RollingUpdate.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of deployment. Can be &#34;Recreate&#34; or &#34;RollingUpdate&#34;. Default is RollingUpdate.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DeploymentStrategyArgs build() {
            return $;
        }
    }

}
