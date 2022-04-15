// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.gameservices.inputs.GetGameServerDeploymentRolloutArgs;
import io.pulumi.gcp.gameservices.outputs.GetGameServerDeploymentRolloutResult;
import java.util.concurrent.CompletableFuture;

public final class GameservicesFunctions {
    /**
     * Use this data source to get the rollout state.
     * 
     * https://cloud.google.com/game-servers/docs/reference/rest/v1beta/GameServerDeploymentRollout
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetGameServerDeploymentRolloutResult> getGameServerDeploymentRollout(GetGameServerDeploymentRolloutArgs args) {
        return getGameServerDeploymentRollout(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGameServerDeploymentRolloutResult> getGameServerDeploymentRollout(GetGameServerDeploymentRolloutArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:gameservices/getGameServerDeploymentRollout:getGameServerDeploymentRollout", TypeShape.of(GetGameServerDeploymentRolloutResult.class), args, Utilities.withVersion(options));
    }
}