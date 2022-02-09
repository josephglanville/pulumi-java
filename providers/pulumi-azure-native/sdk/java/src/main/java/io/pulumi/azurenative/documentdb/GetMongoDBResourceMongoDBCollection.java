// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.inputs.GetMongoDBResourceMongoDBCollectionArgs;
import io.pulumi.azurenative.documentdb.outputs.GetMongoDBResourceMongoDBCollectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMongoDBResourceMongoDBCollection {
    public static CompletableFuture<GetMongoDBResourceMongoDBCollectionResult> invokeAsync(GetMongoDBResourceMongoDBCollectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:documentdb:getMongoDBResourceMongoDBCollection", TypeShape.of(GetMongoDBResourceMongoDBCollectionResult.class), args == null ? GetMongoDBResourceMongoDBCollectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
