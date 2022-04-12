// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.batch.inputs.GetApplicationArgs;
import io.pulumi.azurenative.batch.inputs.GetApplicationPackageArgs;
import io.pulumi.azurenative.batch.inputs.GetBatchAccountArgs;
import io.pulumi.azurenative.batch.inputs.GetCertificateArgs;
import io.pulumi.azurenative.batch.inputs.GetPoolArgs;
import io.pulumi.azurenative.batch.inputs.ListBatchAccountKeysArgs;
import io.pulumi.azurenative.batch.outputs.GetApplicationPackageResult;
import io.pulumi.azurenative.batch.outputs.GetApplicationResult;
import io.pulumi.azurenative.batch.outputs.GetBatchAccountResult;
import io.pulumi.azurenative.batch.outputs.GetCertificateResult;
import io.pulumi.azurenative.batch.outputs.GetPoolResult;
import io.pulumi.azurenative.batch.outputs.ListBatchAccountKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class BatchFunctions {
    /**
     * Contains information about an application in a Batch account.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args) {
        return getApplication(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:batch:getApplication", TypeShape.of(GetApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An application package which represents a particular version of an application.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetApplicationPackageResult> getApplicationPackage(GetApplicationPackageArgs args) {
        return getApplicationPackage(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetApplicationPackageResult> getApplicationPackage(GetApplicationPackageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:batch:getApplicationPackage", TypeShape.of(GetApplicationPackageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Contains information about an Azure Batch account.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetBatchAccountResult> getBatchAccount(GetBatchAccountArgs args) {
        return getBatchAccount(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBatchAccountResult> getBatchAccount(GetBatchAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:batch:getBatchAccount", TypeShape.of(GetBatchAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Contains information about a certificate.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args) {
        return getCertificate(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:batch:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Contains information about a pool.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetPoolResult> getPool(GetPoolArgs args) {
        return getPool(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPoolResult> getPool(GetPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:batch:getPool", TypeShape.of(GetPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A set of Azure Batch account keys.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<ListBatchAccountKeysResult> listBatchAccountKeys(ListBatchAccountKeysArgs args) {
        return listBatchAccountKeys(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListBatchAccountKeysResult> listBatchAccountKeys(ListBatchAccountKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:batch:listBatchAccountKeys", TypeShape.of(ListBatchAccountKeysResult.class), args, Utilities.withVersion(options));
    }
}
