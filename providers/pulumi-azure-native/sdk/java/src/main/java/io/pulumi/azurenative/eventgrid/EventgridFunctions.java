// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.inputs.GetDomainArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetDomainTopicArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetEventChannelArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetEventSubscriptionArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetEventSubscriptionDeliveryAttributesArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetEventSubscriptionFullUrlArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetPartnerNamespaceArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetPartnerRegistrationArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetPartnerTopicEventSubscriptionArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetPartnerTopicEventSubscriptionDeliveryAttributesArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetPartnerTopicEventSubscriptionFullUrlArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetSystemTopicArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetSystemTopicEventSubscriptionArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetSystemTopicEventSubscriptionDeliveryAttributesArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetSystemTopicEventSubscriptionFullUrlArgs;
import io.pulumi.azurenative.eventgrid.inputs.GetTopicArgs;
import io.pulumi.azurenative.eventgrid.inputs.ListDomainSharedAccessKeysArgs;
import io.pulumi.azurenative.eventgrid.inputs.ListPartnerNamespaceSharedAccessKeysArgs;
import io.pulumi.azurenative.eventgrid.inputs.ListTopicSharedAccessKeysArgs;
import io.pulumi.azurenative.eventgrid.outputs.GetDomainResult;
import io.pulumi.azurenative.eventgrid.outputs.GetDomainTopicResult;
import io.pulumi.azurenative.eventgrid.outputs.GetEventChannelResult;
import io.pulumi.azurenative.eventgrid.outputs.GetEventSubscriptionDeliveryAttributesResult;
import io.pulumi.azurenative.eventgrid.outputs.GetEventSubscriptionFullUrlResult;
import io.pulumi.azurenative.eventgrid.outputs.GetEventSubscriptionResult;
import io.pulumi.azurenative.eventgrid.outputs.GetPartnerNamespaceResult;
import io.pulumi.azurenative.eventgrid.outputs.GetPartnerRegistrationResult;
import io.pulumi.azurenative.eventgrid.outputs.GetPartnerTopicEventSubscriptionDeliveryAttributesResult;
import io.pulumi.azurenative.eventgrid.outputs.GetPartnerTopicEventSubscriptionFullUrlResult;
import io.pulumi.azurenative.eventgrid.outputs.GetPartnerTopicEventSubscriptionResult;
import io.pulumi.azurenative.eventgrid.outputs.GetPrivateEndpointConnectionResult;
import io.pulumi.azurenative.eventgrid.outputs.GetSystemTopicEventSubscriptionDeliveryAttributesResult;
import io.pulumi.azurenative.eventgrid.outputs.GetSystemTopicEventSubscriptionFullUrlResult;
import io.pulumi.azurenative.eventgrid.outputs.GetSystemTopicEventSubscriptionResult;
import io.pulumi.azurenative.eventgrid.outputs.GetSystemTopicResult;
import io.pulumi.azurenative.eventgrid.outputs.GetTopicResult;
import io.pulumi.azurenative.eventgrid.outputs.ListDomainSharedAccessKeysResult;
import io.pulumi.azurenative.eventgrid.outputs.ListPartnerNamespaceSharedAccessKeysResult;
import io.pulumi.azurenative.eventgrid.outputs.ListTopicSharedAccessKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class EventgridFunctions {
    /**
     * EventGrid Domain.
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomain(GetDomainArgs args) {
        return getDomain(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDomainResult> getDomain(GetDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Domain Topic.
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetDomainTopicResult> getDomainTopic(GetDomainTopicArgs args) {
        return getDomainTopic(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDomainTopicResult> getDomainTopic(GetDomainTopicArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getDomainTopic", TypeShape.of(GetDomainTopicResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Event Channel.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetEventChannelResult> getEventChannel(GetEventChannelArgs args) {
        return getEventChannel(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEventChannelResult> getEventChannel(GetEventChannelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getEventChannel", TypeShape.of(GetEventChannelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Event Subscription
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetEventSubscriptionResult> getEventSubscription(GetEventSubscriptionArgs args) {
        return getEventSubscription(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEventSubscriptionResult> getEventSubscription(GetEventSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getEventSubscription", TypeShape.of(GetEventSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Result of the Get delivery attributes operation.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetEventSubscriptionDeliveryAttributesResult> getEventSubscriptionDeliveryAttributes(GetEventSubscriptionDeliveryAttributesArgs args) {
        return getEventSubscriptionDeliveryAttributes(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEventSubscriptionDeliveryAttributesResult> getEventSubscriptionDeliveryAttributes(GetEventSubscriptionDeliveryAttributesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getEventSubscriptionDeliveryAttributes", TypeShape.of(GetEventSubscriptionDeliveryAttributesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetEventSubscriptionFullUrlResult> getEventSubscriptionFullUrl(GetEventSubscriptionFullUrlArgs args) {
        return getEventSubscriptionFullUrl(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEventSubscriptionFullUrlResult> getEventSubscriptionFullUrl(GetEventSubscriptionFullUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getEventSubscriptionFullUrl", TypeShape.of(GetEventSubscriptionFullUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * EventGrid Partner Namespace.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetPartnerNamespaceResult> getPartnerNamespace(GetPartnerNamespaceArgs args) {
        return getPartnerNamespace(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPartnerNamespaceResult> getPartnerNamespace(GetPartnerNamespaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerNamespace", TypeShape.of(GetPartnerNamespaceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Information about a partner registration.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetPartnerRegistrationResult> getPartnerRegistration(GetPartnerRegistrationArgs args) {
        return getPartnerRegistration(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPartnerRegistrationResult> getPartnerRegistration(GetPartnerRegistrationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerRegistration", TypeShape.of(GetPartnerRegistrationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Event Subscription
     * API Version: 2020-04-01-preview.
     * 
     */
    public static CompletableFuture<GetPartnerTopicEventSubscriptionResult> getPartnerTopicEventSubscription(GetPartnerTopicEventSubscriptionArgs args) {
        return getPartnerTopicEventSubscription(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPartnerTopicEventSubscriptionResult> getPartnerTopicEventSubscription(GetPartnerTopicEventSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerTopicEventSubscription", TypeShape.of(GetPartnerTopicEventSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Result of the Get delivery attributes operation.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetPartnerTopicEventSubscriptionDeliveryAttributesResult> getPartnerTopicEventSubscriptionDeliveryAttributes(GetPartnerTopicEventSubscriptionDeliveryAttributesArgs args) {
        return getPartnerTopicEventSubscriptionDeliveryAttributes(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPartnerTopicEventSubscriptionDeliveryAttributesResult> getPartnerTopicEventSubscriptionDeliveryAttributes(GetPartnerTopicEventSubscriptionDeliveryAttributesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerTopicEventSubscriptionDeliveryAttributes", TypeShape.of(GetPartnerTopicEventSubscriptionDeliveryAttributesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetPartnerTopicEventSubscriptionFullUrlResult> getPartnerTopicEventSubscriptionFullUrl(GetPartnerTopicEventSubscriptionFullUrlArgs args) {
        return getPartnerTopicEventSubscriptionFullUrl(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPartnerTopicEventSubscriptionFullUrlResult> getPartnerTopicEventSubscriptionFullUrl(GetPartnerTopicEventSubscriptionFullUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerTopicEventSubscriptionFullUrl", TypeShape.of(GetPartnerTopicEventSubscriptionFullUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * EventGrid System Topic.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetSystemTopicResult> getSystemTopic(GetSystemTopicArgs args) {
        return getSystemTopic(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSystemTopicResult> getSystemTopic(GetSystemTopicArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getSystemTopic", TypeShape.of(GetSystemTopicResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Event Subscription
     * API Version: 2020-04-01-preview.
     * 
     */
    public static CompletableFuture<GetSystemTopicEventSubscriptionResult> getSystemTopicEventSubscription(GetSystemTopicEventSubscriptionArgs args) {
        return getSystemTopicEventSubscription(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSystemTopicEventSubscriptionResult> getSystemTopicEventSubscription(GetSystemTopicEventSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getSystemTopicEventSubscription", TypeShape.of(GetSystemTopicEventSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Result of the Get delivery attributes operation.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetSystemTopicEventSubscriptionDeliveryAttributesResult> getSystemTopicEventSubscriptionDeliveryAttributes(GetSystemTopicEventSubscriptionDeliveryAttributesArgs args) {
        return getSystemTopicEventSubscriptionDeliveryAttributes(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSystemTopicEventSubscriptionDeliveryAttributesResult> getSystemTopicEventSubscriptionDeliveryAttributes(GetSystemTopicEventSubscriptionDeliveryAttributesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getSystemTopicEventSubscriptionDeliveryAttributes", TypeShape.of(GetSystemTopicEventSubscriptionDeliveryAttributesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Full endpoint url of an event subscription
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetSystemTopicEventSubscriptionFullUrlResult> getSystemTopicEventSubscriptionFullUrl(GetSystemTopicEventSubscriptionFullUrlArgs args) {
        return getSystemTopicEventSubscriptionFullUrl(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSystemTopicEventSubscriptionFullUrlResult> getSystemTopicEventSubscriptionFullUrl(GetSystemTopicEventSubscriptionFullUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getSystemTopicEventSubscriptionFullUrl", TypeShape.of(GetSystemTopicEventSubscriptionFullUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * EventGrid Topic
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<GetTopicResult> getTopic(GetTopicArgs args) {
        return getTopic(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTopicResult> getTopic(GetTopicArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getTopic", TypeShape.of(GetTopicResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Shared access keys of the Domain.
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<ListDomainSharedAccessKeysResult> listDomainSharedAccessKeys(ListDomainSharedAccessKeysArgs args) {
        return listDomainSharedAccessKeys(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListDomainSharedAccessKeysResult> listDomainSharedAccessKeys(ListDomainSharedAccessKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:listDomainSharedAccessKeys", TypeShape.of(ListDomainSharedAccessKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Shared access keys of the partner namespace.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<ListPartnerNamespaceSharedAccessKeysResult> listPartnerNamespaceSharedAccessKeys(ListPartnerNamespaceSharedAccessKeysArgs args) {
        return listPartnerNamespaceSharedAccessKeys(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListPartnerNamespaceSharedAccessKeysResult> listPartnerNamespaceSharedAccessKeys(ListPartnerNamespaceSharedAccessKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:listPartnerNamespaceSharedAccessKeys", TypeShape.of(ListPartnerNamespaceSharedAccessKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Shared access keys of the Topic
     * API Version: 2020-06-01.
     * 
     */
    public static CompletableFuture<ListTopicSharedAccessKeysResult> listTopicSharedAccessKeys(ListTopicSharedAccessKeysArgs args) {
        return listTopicSharedAccessKeys(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListTopicSharedAccessKeysResult> listTopicSharedAccessKeys(ListTopicSharedAccessKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:listTopicSharedAccessKeys", TypeShape.of(ListTopicSharedAccessKeysResult.class), args, Utilities.withVersion(options));
    }
}
