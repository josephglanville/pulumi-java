// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gameservices_v1beta.inputs.GetConfigArgs;
import io.pulumi.googlenative.gameservices_v1beta.inputs.GetGameServerClusterArgs;
import io.pulumi.googlenative.gameservices_v1beta.inputs.GetGameServerDeploymentArgs;
import io.pulumi.googlenative.gameservices_v1beta.inputs.GetGameServerDeploymentIamPolicyArgs;
import io.pulumi.googlenative.gameservices_v1beta.inputs.GetRealmArgs;
import io.pulumi.googlenative.gameservices_v1beta.outputs.GetConfigResult;
import io.pulumi.googlenative.gameservices_v1beta.outputs.GetGameServerClusterResult;
import io.pulumi.googlenative.gameservices_v1beta.outputs.GetGameServerDeploymentIamPolicyResult;
import io.pulumi.googlenative.gameservices_v1beta.outputs.GetGameServerDeploymentResult;
import io.pulumi.googlenative.gameservices_v1beta.outputs.GetRealmResult;
import java.util.concurrent.CompletableFuture;

public final class Gameservices_v1betaFunctions {
    /**
     * Gets details of a single game server config.
     * 
     */
    public static CompletableFuture<GetConfigResult> getConfig(GetConfigArgs args) {
        return getConfig(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConfigResult> getConfig(GetConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gameservices/v1beta:getConfig", TypeShape.of(GetConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single game server cluster.
     * 
     */
    public static CompletableFuture<GetGameServerClusterResult> getGameServerCluster(GetGameServerClusterArgs args) {
        return getGameServerCluster(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGameServerClusterResult> getGameServerCluster(GetGameServerClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gameservices/v1beta:getGameServerCluster", TypeShape.of(GetGameServerClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single game server deployment.
     * 
     */
    public static CompletableFuture<GetGameServerDeploymentResult> getGameServerDeployment(GetGameServerDeploymentArgs args) {
        return getGameServerDeployment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGameServerDeploymentResult> getGameServerDeployment(GetGameServerDeploymentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gameservices/v1beta:getGameServerDeployment", TypeShape.of(GetGameServerDeploymentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetGameServerDeploymentIamPolicyResult> getGameServerDeploymentIamPolicy(GetGameServerDeploymentIamPolicyArgs args) {
        return getGameServerDeploymentIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGameServerDeploymentIamPolicyResult> getGameServerDeploymentIamPolicy(GetGameServerDeploymentIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gameservices/v1beta:getGameServerDeploymentIamPolicy", TypeShape.of(GetGameServerDeploymentIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single realm.
     * 
     */
    public static CompletableFuture<GetRealmResult> getRealm(GetRealmArgs args) {
        return getRealm(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRealmResult> getRealm(GetRealmArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gameservices/v1beta:getRealm", TypeShape.of(GetRealmResult.class), args, Utilities.withVersion(options));
    }
}
