// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.glue.inputs.GetConnectionArgs;
import io.pulumi.aws.glue.inputs.GetDataCatalogEncryptionSettingsArgs;
import io.pulumi.aws.glue.inputs.GetScriptArgs;
import io.pulumi.aws.glue.outputs.GetConnectionResult;
import io.pulumi.aws.glue.outputs.GetDataCatalogEncryptionSettingsResult;
import io.pulumi.aws.glue.outputs.GetScriptResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class GlueFunctions {
    /**
     * This data source can be used to fetch information about a specific Glue Connection.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetConnectionResult> getConnection(GetConnectionArgs args) {
        return getConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetConnectionResult> getConnection(GetConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:glue/getConnection:getConnection", TypeShape.of(GetConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source can be used to fetch information about AWS Glue Data Catalog Encryption Settings.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDataCatalogEncryptionSettingsResult> getDataCatalogEncryptionSettings(GetDataCatalogEncryptionSettingsArgs args) {
        return getDataCatalogEncryptionSettings(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDataCatalogEncryptionSettingsResult> getDataCatalogEncryptionSettings(GetDataCatalogEncryptionSettingsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:glue/getDataCatalogEncryptionSettings:getDataCatalogEncryptionSettings", TypeShape.of(GetDataCatalogEncryptionSettingsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to generate a Glue script from a Directed Acyclic Graph (DAG).
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetScriptResult> getScript(GetScriptArgs args) {
        return getScript(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetScriptResult> getScript(GetScriptArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:glue/getScript:getScript", TypeShape.of(GetScriptResult.class), args, Utilities.withVersion(options));
    }
}