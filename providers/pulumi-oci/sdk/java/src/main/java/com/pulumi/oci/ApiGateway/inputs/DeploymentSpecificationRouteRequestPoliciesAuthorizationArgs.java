// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentSpecificationRouteRequestPoliciesAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentSpecificationRouteRequestPoliciesAuthorizationArgs Empty = new DeploymentSpecificationRouteRequestPoliciesAuthorizationArgs();

    /**
     * (Updatable) A user whose scope includes any of these access ranges is allowed on this route. Access ranges are case-sensitive.
     * 
     */
    @Import(name="allowedScopes")
    private @Nullable Output<List<String>> allowedScopes;

    /**
     * @return (Updatable) A user whose scope includes any of these access ranges is allowed on this route. Access ranges are case-sensitive.
     * 
     */
    public Optional<Output<List<String>>> allowedScopes() {
        return Optional.ofNullable(this.allowedScopes);
    }

    /**
     * (Updatable) Type of the Response Cache Store Policy.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return (Updatable) Type of the Response Cache Store Policy.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DeploymentSpecificationRouteRequestPoliciesAuthorizationArgs() {}

    private DeploymentSpecificationRouteRequestPoliciesAuthorizationArgs(DeploymentSpecificationRouteRequestPoliciesAuthorizationArgs $) {
        this.allowedScopes = $.allowedScopes;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentSpecificationRouteRequestPoliciesAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentSpecificationRouteRequestPoliciesAuthorizationArgs $;

        public Builder() {
            $ = new DeploymentSpecificationRouteRequestPoliciesAuthorizationArgs();
        }

        public Builder(DeploymentSpecificationRouteRequestPoliciesAuthorizationArgs defaults) {
            $ = new DeploymentSpecificationRouteRequestPoliciesAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedScopes (Updatable) A user whose scope includes any of these access ranges is allowed on this route. Access ranges are case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder allowedScopes(@Nullable Output<List<String>> allowedScopes) {
            $.allowedScopes = allowedScopes;
            return this;
        }

        /**
         * @param allowedScopes (Updatable) A user whose scope includes any of these access ranges is allowed on this route. Access ranges are case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder allowedScopes(List<String> allowedScopes) {
            return allowedScopes(Output.of(allowedScopes));
        }

        /**
         * @param allowedScopes (Updatable) A user whose scope includes any of these access ranges is allowed on this route. Access ranges are case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder allowedScopes(String... allowedScopes) {
            return allowedScopes(List.of(allowedScopes));
        }

        /**
         * @param type (Updatable) Type of the Response Cache Store Policy.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type (Updatable) Type of the Response Cache Store Policy.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DeploymentSpecificationRouteRequestPoliciesAuthorizationArgs build() {
            return $;
        }
    }

}
