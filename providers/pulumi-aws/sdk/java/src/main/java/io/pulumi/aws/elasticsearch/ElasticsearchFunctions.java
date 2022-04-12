// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elasticsearch.inputs.GetDomainArgs;
import io.pulumi.aws.elasticsearch.outputs.GetDomainResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ElasticsearchFunctions {
    /**
     * Use this data source to get information about an Elasticsearch Domain
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomain(GetDomainArgs args) {
        return getDomain(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDomainResult> getDomain(GetDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elasticsearch/getDomain:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
}
