// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetApiManagementServiceDomainOwnershipIdentifierArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetApiManagementServiceDomainOwnershipIdentifierResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApiManagementServiceDomainOwnershipIdentifier {
    public static CompletableFuture<GetApiManagementServiceDomainOwnershipIdentifierResult> invokeAsync(@Nullable GetApiManagementServiceDomainOwnershipIdentifierArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getApiManagementServiceDomainOwnershipIdentifier", TypeShape.of(GetApiManagementServiceDomainOwnershipIdentifierResult.class), args == null ? GetApiManagementServiceDomainOwnershipIdentifierArgs.Empty : args, Utilities.withVersion(options));
    }
}
