// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confidentialledger;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.confidentialledger.inputs.GetLedgerArgs;
import io.pulumi.azurenative.confidentialledger.outputs.GetLedgerResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ConfidentialledgerFunctions {
    /**
     * Confidential Ledger. Contains the properties of Confidential Ledger Resource.
     * API Version: 2020-12-01-preview.
     * 
     */
    public static CompletableFuture<GetLedgerResult> getLedger(GetLedgerArgs args) {
        return getLedger(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLedgerResult> getLedger(GetLedgerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:confidentialledger:getLedger", TypeShape.of(GetLedgerResult.class), args, Utilities.withVersion(options));
    }
}