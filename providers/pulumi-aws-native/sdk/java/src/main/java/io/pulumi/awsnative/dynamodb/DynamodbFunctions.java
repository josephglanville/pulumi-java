// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.dynamodb.inputs.GetGlobalTableArgs;
import io.pulumi.awsnative.dynamodb.outputs.GetGlobalTableResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DynamodbFunctions {
    /**
     * Version: None. Resource Type definition for AWS::DynamoDB::GlobalTable
     * 
     */
    public static CompletableFuture<GetGlobalTableResult> getGlobalTable(GetGlobalTableArgs args) {
        return getGlobalTable(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGlobalTableResult> getGlobalTable(GetGlobalTableArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:dynamodb:getGlobalTable", TypeShape.of(GetGlobalTableResult.class), args, Utilities.withVersion(options));
    }
}