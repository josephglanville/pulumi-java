// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3.SessionEntityTypeArgs;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3EntityTypeEntityResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a session entity type.
 * 
 */
@ResourceType(type="google-native:dialogflow/v3:SessionEntityType")
public class SessionEntityType extends io.pulumi.resources.CustomResource {
    /**
     * The collection of entities to override or supplement the custom entity type.
     * 
     */
    @Export(name="entities", type=List.class, parameters={GoogleCloudDialogflowCxV3EntityTypeEntityResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3EntityTypeEntityResponse>> entities;

    /**
     * @return The collection of entities to override or supplement the custom entity type.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3EntityTypeEntityResponse>> getEntities() {
        return this.entities;
    }
    /**
     * Indicates whether the additional data should override or supplement the custom entity type definition.
     * 
     */
    @Export(name="entityOverrideMode", type=String.class, parameters={})
    private Output<String> entityOverrideMode;

    /**
     * @return Indicates whether the additional data should override or supplement the custom entity type definition.
     * 
     */
    public Output<String> getEntityOverrideMode() {
        return this.entityOverrideMode;
    }
    /**
     * The unique identifier of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(SessionEntityTypeArgs.Builder a);
    }
    private static io.pulumi.googlenative.dialogflow_v3.SessionEntityTypeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.dialogflow_v3.SessionEntityTypeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SessionEntityType(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SessionEntityType(String name) {
        this(name, SessionEntityTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SessionEntityType(String name, SessionEntityTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SessionEntityType(String name, SessionEntityTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:SessionEntityType", name, args == null ? SessionEntityTypeArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SessionEntityType(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:SessionEntityType", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static SessionEntityType get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SessionEntityType(name, id, options);
    }
}
