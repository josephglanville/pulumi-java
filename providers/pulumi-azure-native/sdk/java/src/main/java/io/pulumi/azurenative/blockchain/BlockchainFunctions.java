// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.blockchain.inputs.GetBlockchainMemberArgs;
import io.pulumi.azurenative.blockchain.inputs.GetTransactionNodeArgs;
import io.pulumi.azurenative.blockchain.inputs.ListBlockchainMemberApiKeysArgs;
import io.pulumi.azurenative.blockchain.inputs.ListLocationConsortiumsArgs;
import io.pulumi.azurenative.blockchain.inputs.ListTransactionNodeApiKeysArgs;
import io.pulumi.azurenative.blockchain.outputs.GetBlockchainMemberResult;
import io.pulumi.azurenative.blockchain.outputs.GetTransactionNodeResult;
import io.pulumi.azurenative.blockchain.outputs.ListBlockchainMemberApiKeysResult;
import io.pulumi.azurenative.blockchain.outputs.ListLocationConsortiumsResult;
import io.pulumi.azurenative.blockchain.outputs.ListTransactionNodeApiKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class BlockchainFunctions {
    /**
     * Payload of the blockchain member which is exposed in the request/response of the resource provider.
     * API Version: 2018-06-01-preview.
     * 
     */
    public static CompletableFuture<GetBlockchainMemberResult> getBlockchainMember(GetBlockchainMemberArgs args) {
        return getBlockchainMember(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBlockchainMemberResult> getBlockchainMember(GetBlockchainMemberArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:blockchain:getBlockchainMember", TypeShape.of(GetBlockchainMemberResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Payload of the transaction node which is the request/response of the resource provider.
     * API Version: 2018-06-01-preview.
     * 
     */
    public static CompletableFuture<GetTransactionNodeResult> getTransactionNode(GetTransactionNodeArgs args) {
        return getTransactionNode(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTransactionNodeResult> getTransactionNode(GetTransactionNodeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:blockchain:getTransactionNode", TypeShape.of(GetTransactionNodeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Collection of the API key payload which is exposed in the response of the resource provider.
     * API Version: 2018-06-01-preview.
     * 
     */
    public static CompletableFuture<ListBlockchainMemberApiKeysResult> listBlockchainMemberApiKeys(ListBlockchainMemberApiKeysArgs args) {
        return listBlockchainMemberApiKeys(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListBlockchainMemberApiKeysResult> listBlockchainMemberApiKeys(ListBlockchainMemberApiKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:blockchain:listBlockchainMemberApiKeys", TypeShape.of(ListBlockchainMemberApiKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Collection of the consortium payload.
     * API Version: 2018-06-01-preview.
     * 
     */
    public static CompletableFuture<ListLocationConsortiumsResult> listLocationConsortiums(ListLocationConsortiumsArgs args) {
        return listLocationConsortiums(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListLocationConsortiumsResult> listLocationConsortiums(ListLocationConsortiumsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:blockchain:listLocationConsortiums", TypeShape.of(ListLocationConsortiumsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Collection of the API key payload which is exposed in the response of the resource provider.
     * API Version: 2018-06-01-preview.
     * 
     */
    public static CompletableFuture<ListTransactionNodeApiKeysResult> listTransactionNodeApiKeys(ListTransactionNodeApiKeysArgs args) {
        return listTransactionNodeApiKeys(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListTransactionNodeApiKeysResult> listTransactionNodeApiKeys(ListTransactionNodeApiKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:blockchain:listTransactionNodeApiKeys", TypeShape.of(ListTransactionNodeApiKeysResult.class), args, Utilities.withVersion(options));
    }
}