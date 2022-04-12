// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azurestack.inputs.GetCustomerSubscriptionArgs;
import io.pulumi.azurenative.azurestack.inputs.GetLinkedSubscriptionArgs;
import io.pulumi.azurenative.azurestack.inputs.GetProductArgs;
import io.pulumi.azurenative.azurestack.inputs.GetProductsArgs;
import io.pulumi.azurenative.azurestack.inputs.GetRegistrationActivationKeyArgs;
import io.pulumi.azurenative.azurestack.inputs.GetRegistrationArgs;
import io.pulumi.azurenative.azurestack.inputs.ListProductDetailsArgs;
import io.pulumi.azurenative.azurestack.outputs.GetCustomerSubscriptionResult;
import io.pulumi.azurenative.azurestack.outputs.GetLinkedSubscriptionResult;
import io.pulumi.azurenative.azurestack.outputs.GetProductResult;
import io.pulumi.azurenative.azurestack.outputs.GetProductsResult;
import io.pulumi.azurenative.azurestack.outputs.GetRegistrationActivationKeyResult;
import io.pulumi.azurenative.azurestack.outputs.GetRegistrationResult;
import io.pulumi.azurenative.azurestack.outputs.ListProductDetailsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AzurestackFunctions {
    /**
     * Customer subscription.
     * API Version: 2017-06-01.
     * 
     */
    public static CompletableFuture<GetCustomerSubscriptionResult> getCustomerSubscription(GetCustomerSubscriptionArgs args) {
        return getCustomerSubscription(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCustomerSubscriptionResult> getCustomerSubscription(GetCustomerSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azurestack:getCustomerSubscription", TypeShape.of(GetCustomerSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Linked Subscription information.
     * API Version: 2020-06-01-preview.
     * 
     */
    public static CompletableFuture<GetLinkedSubscriptionResult> getLinkedSubscription(GetLinkedSubscriptionArgs args) {
        return getLinkedSubscription(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLinkedSubscriptionResult> getLinkedSubscription(GetLinkedSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azurestack:getLinkedSubscription", TypeShape.of(GetLinkedSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Product information.
     * API Version: 2017-06-01.
     * 
     */
    public static CompletableFuture<GetProductResult> getProduct(GetProductArgs args) {
        return getProduct(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetProductResult> getProduct(GetProductArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azurestack:getProduct", TypeShape.of(GetProductResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Pageable list of products.
     * API Version: 2017-06-01.
     * 
     */
    public static CompletableFuture<GetProductsResult> getProducts(GetProductsArgs args) {
        return getProducts(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetProductsResult> getProducts(GetProductsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azurestack:getProducts", TypeShape.of(GetProductsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Registration information.
     * API Version: 2017-06-01.
     * 
     */
    public static CompletableFuture<GetRegistrationResult> getRegistration(GetRegistrationArgs args) {
        return getRegistration(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRegistrationResult> getRegistration(GetRegistrationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azurestack:getRegistration", TypeShape.of(GetRegistrationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The resource containing the Azure Stack activation key.
     * API Version: 2017-06-01.
     * 
     */
    public static CompletableFuture<GetRegistrationActivationKeyResult> getRegistrationActivationKey(GetRegistrationActivationKeyArgs args) {
        return getRegistrationActivationKey(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRegistrationActivationKeyResult> getRegistrationActivationKey(GetRegistrationActivationKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azurestack:getRegistrationActivationKey", TypeShape.of(GetRegistrationActivationKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Extended description about the product required for installing it into Azure Stack.
     * API Version: 2017-06-01.
     * 
     */
    public static CompletableFuture<ListProductDetailsResult> listProductDetails(ListProductDetailsArgs args) {
        return listProductDetails(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListProductDetailsResult> listProductDetails(ListProductDetailsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azurestack:listProductDetails", TypeShape.of(ListProductDetailsResult.class), args, Utilities.withVersion(options));
    }
}
