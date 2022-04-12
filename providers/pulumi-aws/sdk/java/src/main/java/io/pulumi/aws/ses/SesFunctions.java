// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ses.inputs.GetDomainIdentityArgs;
import io.pulumi.aws.ses.inputs.GetEmailIdentityArgs;
import io.pulumi.aws.ses.outputs.GetActiveReceiptRuleSetResult;
import io.pulumi.aws.ses.outputs.GetDomainIdentityResult;
import io.pulumi.aws.ses.outputs.GetEmailIdentityResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class SesFunctions {
    /**
     * Retrieve the active SES receipt rule set
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetActiveReceiptRuleSetResult> getActiveReceiptRuleSet() {
        return getActiveReceiptRuleSet(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetActiveReceiptRuleSetResult> getActiveReceiptRuleSet(InvokeArgs args) {
        return getActiveReceiptRuleSet(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetActiveReceiptRuleSetResult> getActiveReceiptRuleSet(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ses/getActiveReceiptRuleSet:getActiveReceiptRuleSet", TypeShape.of(GetActiveReceiptRuleSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve the SES domain identity
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDomainIdentityResult> getDomainIdentity(GetDomainIdentityArgs args) {
        return getDomainIdentity(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDomainIdentityResult> getDomainIdentity(GetDomainIdentityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ses/getDomainIdentity:getDomainIdentity", TypeShape.of(GetDomainIdentityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve the active SES email identity
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetEmailIdentityResult> getEmailIdentity(GetEmailIdentityArgs args) {
        return getEmailIdentity(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEmailIdentityResult> getEmailIdentity(GetEmailIdentityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ses/getEmailIdentity:getEmailIdentity", TypeShape.of(GetEmailIdentityResult.class), args, Utilities.withVersion(options));
    }
}
