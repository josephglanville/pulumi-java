// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datalakeanalytics.inputs.GetAccountArgs;
import io.pulumi.azurenative.datalakeanalytics.inputs.GetComputePolicyArgs;
import io.pulumi.azurenative.datalakeanalytics.inputs.GetFirewallRuleArgs;
import io.pulumi.azurenative.datalakeanalytics.inputs.ListStorageAccountSasTokensArgs;
import io.pulumi.azurenative.datalakeanalytics.outputs.GetAccountResult;
import io.pulumi.azurenative.datalakeanalytics.outputs.GetComputePolicyResult;
import io.pulumi.azurenative.datalakeanalytics.outputs.GetFirewallRuleResult;
import io.pulumi.azurenative.datalakeanalytics.outputs.ListStorageAccountSasTokensResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DatalakeanalyticsFunctions {
    /**
     * A Data Lake Analytics account object, containing all information associated with the named Data Lake Analytics account.
     * API Version: 2016-11-01.
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datalakeanalytics:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data Lake Analytics compute policy information.
     * API Version: 2016-11-01.
     * 
     */
    public static CompletableFuture<GetComputePolicyResult> getComputePolicy(GetComputePolicyArgs args) {
        return getComputePolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetComputePolicyResult> getComputePolicy(GetComputePolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datalakeanalytics:getComputePolicy", TypeShape.of(GetComputePolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data Lake Analytics firewall rule information.
     * API Version: 2016-11-01.
     * 
     */
    public static CompletableFuture<GetFirewallRuleResult> getFirewallRule(GetFirewallRuleArgs args) {
        return getFirewallRule(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFirewallRuleResult> getFirewallRule(GetFirewallRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datalakeanalytics:getFirewallRule", TypeShape.of(GetFirewallRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The SAS response that contains the storage account, container and associated SAS token for connection use.
     * API Version: 2016-11-01.
     * 
     */
    public static CompletableFuture<ListStorageAccountSasTokensResult> listStorageAccountSasTokens(ListStorageAccountSasTokensArgs args) {
        return listStorageAccountSasTokens(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListStorageAccountSasTokensResult> listStorageAccountSasTokens(ListStorageAccountSasTokensArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datalakeanalytics:listStorageAccountSasTokens", TypeShape.of(ListStorageAccountSasTokensResult.class), args, Utilities.withVersion(options));
    }
}