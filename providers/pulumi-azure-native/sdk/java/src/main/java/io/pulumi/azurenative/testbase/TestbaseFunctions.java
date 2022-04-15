// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.testbase.inputs.GetCustomerEventArgs;
import io.pulumi.azurenative.testbase.inputs.GetFavoriteProcessArgs;
import io.pulumi.azurenative.testbase.inputs.GetPackageArgs;
import io.pulumi.azurenative.testbase.inputs.GetPackageDownloadURLArgs;
import io.pulumi.azurenative.testbase.inputs.GetTestBaseAccountArgs;
import io.pulumi.azurenative.testbase.inputs.GetTestBaseAccountFileUploadUrlArgs;
import io.pulumi.azurenative.testbase.inputs.GetTestResultDownloadURLArgs;
import io.pulumi.azurenative.testbase.inputs.GetTestResultVideoDownloadURLArgs;
import io.pulumi.azurenative.testbase.outputs.GetCustomerEventResult;
import io.pulumi.azurenative.testbase.outputs.GetFavoriteProcessResult;
import io.pulumi.azurenative.testbase.outputs.GetPackageDownloadURLResult;
import io.pulumi.azurenative.testbase.outputs.GetPackageResult;
import io.pulumi.azurenative.testbase.outputs.GetTestBaseAccountFileUploadUrlResult;
import io.pulumi.azurenative.testbase.outputs.GetTestBaseAccountResult;
import io.pulumi.azurenative.testbase.outputs.GetTestResultDownloadURLResult;
import io.pulumi.azurenative.testbase.outputs.GetTestResultVideoDownloadURLResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class TestbaseFunctions {
    /**
     * The Customer Notification Event resource.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetCustomerEventResult> getCustomerEvent(GetCustomerEventArgs args) {
        return getCustomerEvent(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCustomerEventResult> getCustomerEvent(GetCustomerEventArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getCustomerEvent", TypeShape.of(GetCustomerEventResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A favorite process identifier.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetFavoriteProcessResult> getFavoriteProcess(GetFavoriteProcessArgs args) {
        return getFavoriteProcess(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFavoriteProcessResult> getFavoriteProcess(GetFavoriteProcessArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getFavoriteProcess", TypeShape.of(GetFavoriteProcessResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Test Base Package resource.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetPackageResult> getPackage(GetPackageArgs args) {
        return getPackage(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPackageResult> getPackage(GetPackageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getPackage", TypeShape.of(GetPackageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetPackageDownloadURLResult> getPackageDownloadURL(GetPackageDownloadURLArgs args) {
        return getPackageDownloadURL(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPackageDownloadURLResult> getPackageDownloadURL(GetPackageDownloadURLArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getPackageDownloadURL", TypeShape.of(GetPackageDownloadURLResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Test Base Account resource.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetTestBaseAccountResult> getTestBaseAccount(GetTestBaseAccountArgs args) {
        return getTestBaseAccount(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTestBaseAccountResult> getTestBaseAccount(GetTestBaseAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getTestBaseAccount", TypeShape.of(GetTestBaseAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The URL response
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetTestBaseAccountFileUploadUrlResult> getTestBaseAccountFileUploadUrl(GetTestBaseAccountFileUploadUrlArgs args) {
        return getTestBaseAccountFileUploadUrl(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTestBaseAccountFileUploadUrlResult> getTestBaseAccountFileUploadUrl(GetTestBaseAccountFileUploadUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getTestBaseAccountFileUploadUrl", TypeShape.of(GetTestBaseAccountFileUploadUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetTestResultDownloadURLResult> getTestResultDownloadURL(GetTestResultDownloadURLArgs args) {
        return getTestResultDownloadURL(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTestResultDownloadURLResult> getTestResultDownloadURL(GetTestResultDownloadURLArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getTestResultDownloadURL", TypeShape.of(GetTestResultDownloadURLResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetTestResultVideoDownloadURLResult> getTestResultVideoDownloadURL(GetTestResultVideoDownloadURLArgs args) {
        return getTestResultVideoDownloadURL(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTestResultVideoDownloadURLResult> getTestResultVideoDownloadURL(GetTestResultVideoDownloadURLArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getTestResultVideoDownloadURL", TypeShape.of(GetTestResultVideoDownloadURLResult.class), args, Utilities.withVersion(options));
    }
}