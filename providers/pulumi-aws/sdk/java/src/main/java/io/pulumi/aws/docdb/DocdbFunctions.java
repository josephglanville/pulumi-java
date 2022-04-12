// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.docdb.inputs.GetEngineVersionArgs;
import io.pulumi.aws.docdb.inputs.GetOrderableDbInstanceArgs;
import io.pulumi.aws.docdb.outputs.GetEngineVersionResult;
import io.pulumi.aws.docdb.outputs.GetOrderableDbInstanceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DocdbFunctions {
    /**
     * Information about a DocumentDB engine version.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetEngineVersionResult> getEngineVersion() {
        return getEngineVersion(GetEngineVersionArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEngineVersionResult> getEngineVersion(GetEngineVersionArgs args) {
        return getEngineVersion(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEngineVersionResult> getEngineVersion(GetEngineVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:docdb/getEngineVersion:getEngineVersion", TypeShape.of(GetEngineVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Information about DocumentDB orderable DB instances.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOrderableDbInstanceResult> getOrderableDbInstance() {
        return getOrderableDbInstance(GetOrderableDbInstanceArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrderableDbInstanceResult> getOrderableDbInstance(GetOrderableDbInstanceArgs args) {
        return getOrderableDbInstance(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOrderableDbInstanceResult> getOrderableDbInstance(GetOrderableDbInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:docdb/getOrderableDbInstance:getOrderableDbInstance", TypeShape.of(GetOrderableDbInstanceResult.class), args, Utilities.withVersion(options));
    }
}
