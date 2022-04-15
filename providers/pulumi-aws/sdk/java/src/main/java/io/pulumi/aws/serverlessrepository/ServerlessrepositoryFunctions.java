// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.serverlessrepository;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.serverlessrepository.inputs.GetApplicationArgs;
import io.pulumi.aws.serverlessrepository.outputs.GetApplicationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ServerlessrepositoryFunctions {
    /**
     * Use this data source to get information about an AWS Serverless Application Repository application. For example, this can be used to determine the required `capabilities` for an application.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args) {
        return getApplication(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:serverlessrepository/getApplication:getApplication", TypeShape.of(GetApplicationResult.class), args, Utilities.withVersion(options));
    }
}