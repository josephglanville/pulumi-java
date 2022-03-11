// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.WorkloadGroupArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Workload group operations for a data warehouse
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:WorkloadGroup smallrc /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-SouthEastAsia/providers/Microsoft.Sql/servers/testsvr/databases/testdb/workloadGroups/smallrc 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:WorkloadGroup")
public class WorkloadGroup extends io.pulumi.resources.CustomResource {
    /**
     * The workload group importance level.
     * 
     */
    @OutputExport(name="importance", type=String.class, parameters={})
    private Output</* @Nullable */ String> importance;

    /**
     * @return The workload group importance level.
     * 
     */
    public Output</* @Nullable */ String> getImportance() {
        return this.importance;
    }
    /**
     * The workload group cap percentage resource.
     * 
     */
    @OutputExport(name="maxResourcePercent", type=Integer.class, parameters={})
    private Output<Integer> maxResourcePercent;

    /**
     * @return The workload group cap percentage resource.
     * 
     */
    public Output<Integer> getMaxResourcePercent() {
        return this.maxResourcePercent;
    }
    /**
     * The workload group request maximum grant percentage.
     * 
     */
    @OutputExport(name="maxResourcePercentPerRequest", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> maxResourcePercentPerRequest;

    /**
     * @return The workload group request maximum grant percentage.
     * 
     */
    public Output</* @Nullable */ Double> getMaxResourcePercentPerRequest() {
        return this.maxResourcePercentPerRequest;
    }
    /**
     * The workload group minimum percentage resource.
     * 
     */
    @OutputExport(name="minResourcePercent", type=Integer.class, parameters={})
    private Output<Integer> minResourcePercent;

    /**
     * @return The workload group minimum percentage resource.
     * 
     */
    public Output<Integer> getMinResourcePercent() {
        return this.minResourcePercent;
    }
    /**
     * The workload group request minimum grant percentage.
     * 
     */
    @OutputExport(name="minResourcePercentPerRequest", type=Double.class, parameters={})
    private Output<Double> minResourcePercentPerRequest;

    /**
     * @return The workload group request minimum grant percentage.
     * 
     */
    public Output<Double> getMinResourcePercentPerRequest() {
        return this.minResourcePercentPerRequest;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The workload group query execution timeout.
     * 
     */
    @OutputExport(name="queryExecutionTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> queryExecutionTimeout;

    /**
     * @return The workload group query execution timeout.
     * 
     */
    public Output</* @Nullable */ Integer> getQueryExecutionTimeout() {
        return this.queryExecutionTimeout;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(WorkloadGroupArgs.Builder a);
    }
    private static io.pulumi.azurenative.sql.WorkloadGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sql.WorkloadGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WorkloadGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkloadGroup(String name) {
        this(name, WorkloadGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkloadGroup(String name, WorkloadGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkloadGroup(String name, WorkloadGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:WorkloadGroup", name, args == null ? WorkloadGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private WorkloadGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:WorkloadGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:sql/v20190601preview:WorkloadGroup").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20200202preview:WorkloadGroup").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20200801preview:WorkloadGroup").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20201101preview:WorkloadGroup").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20210201preview:WorkloadGroup").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20210501preview:WorkloadGroup").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20210801preview:WorkloadGroup").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static WorkloadGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkloadGroup(name, id, options);
    }
}
