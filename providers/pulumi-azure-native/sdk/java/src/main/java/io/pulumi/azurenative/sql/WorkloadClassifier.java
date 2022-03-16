// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.WorkloadClassifierArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Workload classifier operations for a data warehouse
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:WorkloadClassifier wlm_workloadclassifier /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-SouthEastAsia/providers/Microsoft.Sql/servers/testsvr/databases/testdb/workloadGroups/wlm_workloadgroup/workloadClassifiers/wlm_workloadclassifier 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:WorkloadClassifier")
public class WorkloadClassifier extends io.pulumi.resources.CustomResource {
    /**
     * The workload classifier context.
     * 
     */
    @Export(name="context", type=String.class, parameters={})
    private Output</* @Nullable */ String> context;

    /**
     * @return The workload classifier context.
     * 
     */
    public Output</* @Nullable */ String> getContext() {
        return this.context;
    }
    /**
     * The workload classifier end time for classification.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> endTime;

    /**
     * @return The workload classifier end time for classification.
     * 
     */
    public Output</* @Nullable */ String> getEndTime() {
        return this.endTime;
    }
    /**
     * The workload classifier importance.
     * 
     */
    @Export(name="importance", type=String.class, parameters={})
    private Output</* @Nullable */ String> importance;

    /**
     * @return The workload classifier importance.
     * 
     */
    public Output</* @Nullable */ String> getImportance() {
        return this.importance;
    }
    /**
     * The workload classifier label.
     * 
     */
    @Export(name="label", type=String.class, parameters={})
    private Output</* @Nullable */ String> label;

    /**
     * @return The workload classifier label.
     * 
     */
    public Output</* @Nullable */ String> getLabel() {
        return this.label;
    }
    /**
     * The workload classifier member name.
     * 
     */
    @Export(name="memberName", type=String.class, parameters={})
    private Output<String> memberName;

    /**
     * @return The workload classifier member name.
     * 
     */
    public Output<String> getMemberName() {
        return this.memberName;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The workload classifier start time for classification.
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> startTime;

    /**
     * @return The workload classifier start time for classification.
     * 
     */
    public Output</* @Nullable */ String> getStartTime() {
        return this.startTime;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(WorkloadClassifierArgs.Builder a);
    }
    private static io.pulumi.azurenative.sql.WorkloadClassifierArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sql.WorkloadClassifierArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WorkloadClassifier(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkloadClassifier(String name) {
        this(name, WorkloadClassifierArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkloadClassifier(String name, WorkloadClassifierArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkloadClassifier(String name, WorkloadClassifierArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:WorkloadClassifier", name, args == null ? WorkloadClassifierArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private WorkloadClassifier(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:WorkloadClassifier", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20190601preview:WorkloadClassifier").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:WorkloadClassifier").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:WorkloadClassifier").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:WorkloadClassifier").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:WorkloadClassifier").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:WorkloadClassifier").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:WorkloadClassifier").build())
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
    public static WorkloadClassifier get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkloadClassifier(name, id, options);
    }
}
