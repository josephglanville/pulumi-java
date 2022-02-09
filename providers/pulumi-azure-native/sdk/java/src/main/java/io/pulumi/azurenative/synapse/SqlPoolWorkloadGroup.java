// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.SqlPoolWorkloadGroupArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:synapse:SqlPoolWorkloadGroup")
public class SqlPoolWorkloadGroup extends io.pulumi.resources.CustomResource {
    @OutputExport(name="importance", type=String.class, parameters={})
    private Output</* @Nullable */ String> importance;

    public Output</* @Nullable */ String> getImportance() {
        return this.importance;
    }
    @OutputExport(name="maxResourcePercent", type=Integer.class, parameters={})
    private Output<Integer> maxResourcePercent;

    public Output<Integer> getMaxResourcePercent() {
        return this.maxResourcePercent;
    }
    @OutputExport(name="maxResourcePercentPerRequest", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> maxResourcePercentPerRequest;

    public Output</* @Nullable */ Double> getMaxResourcePercentPerRequest() {
        return this.maxResourcePercentPerRequest;
    }
    @OutputExport(name="minResourcePercent", type=Integer.class, parameters={})
    private Output<Integer> minResourcePercent;

    public Output<Integer> getMinResourcePercent() {
        return this.minResourcePercent;
    }
    @OutputExport(name="minResourcePercentPerRequest", type=Double.class, parameters={})
    private Output<Double> minResourcePercentPerRequest;

    public Output<Double> getMinResourcePercentPerRequest() {
        return this.minResourcePercentPerRequest;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="queryExecutionTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> queryExecutionTimeout;

    public Output</* @Nullable */ Integer> getQueryExecutionTimeout() {
        return this.queryExecutionTimeout;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public SqlPoolWorkloadGroup(String name, SqlPoolWorkloadGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:SqlPoolWorkloadGroup", name, args == null ? SqlPoolWorkloadGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SqlPoolWorkloadGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:SqlPoolWorkloadGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:synapse/v20190601preview:SqlPoolWorkloadGroup").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20201201:SqlPoolWorkloadGroup").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210301:SqlPoolWorkloadGroup").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210401preview:SqlPoolWorkloadGroup").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210501:SqlPoolWorkloadGroup").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601:SqlPoolWorkloadGroup").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601preview:SqlPoolWorkloadGroup").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SqlPoolWorkloadGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlPoolWorkloadGroup(name, id, options);
    }
}
