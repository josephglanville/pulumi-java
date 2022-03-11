// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.resourcemanager;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.resourcemanager.LienArgs;
import io.pulumi.gcp.resourcemanager.inputs.LienState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Lien represents an encumbrance on the actions that can be performed on a resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Lien can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:resourcemanager/lien:Lien default {{parent}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:resourcemanager/lien:Lien")
public class Lien extends io.pulumi.resources.CustomResource {
    /**
     * Time of creation
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time of creation
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * A system-generated unique identifier for this Lien.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A system-generated unique identifier for this Lien.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A stable, user-visible/meaningful string identifying the origin
     * of the Lien, intended to be inspected programmatically. Maximum length of
     * 200 characters.
     * 
     */
    @OutputExport(name="origin", type=String.class, parameters={})
    private Output<String> origin;

    /**
     * @return A stable, user-visible/meaningful string identifying the origin
     * of the Lien, intended to be inspected programmatically. Maximum length of
     * 200 characters.
     * 
     */
    public Output<String> getOrigin() {
        return this.origin;
    }
    /**
     * A reference to the resource this Lien is attached to.
     * The server will validate the parent against those for which Liens are supported.
     * Since a variety of objects can have Liens against them, you must provide the type
     * prefix (e.g. "projects/my-project-name").
     * 
     */
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return A reference to the resource this Lien is attached to.
     * The server will validate the parent against those for which Liens are supported.
     * Since a variety of objects can have Liens against them, you must provide the type
     * prefix (e.g. "projects/my-project-name").
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }
    /**
     * Concise user-visible strings indicating why an action cannot be performed
     * on a resource. Maximum length of 200 characters.
     * 
     */
    @OutputExport(name="reason", type=String.class, parameters={})
    private Output<String> reason;

    /**
     * @return Concise user-visible strings indicating why an action cannot be performed
     * on a resource. Maximum length of 200 characters.
     * 
     */
    public Output<String> getReason() {
        return this.reason;
    }
    /**
     * The types of operations which should be blocked as a result of this Lien.
     * Each value should correspond to an IAM permission. The server will validate
     * the permissions against those for which Liens are supported.  An empty
     * list is meaningless and will be rejected.
     * e.g. ['resourcemanager.projects.delete']
     * 
     */
    @OutputExport(name="restrictions", type=List.class, parameters={String.class})
    private Output<List<String>> restrictions;

    /**
     * @return The types of operations which should be blocked as a result of this Lien.
     * Each value should correspond to an IAM permission. The server will validate
     * the permissions against those for which Liens are supported.  An empty
     * list is meaningless and will be rejected.
     * e.g. ['resourcemanager.projects.delete']
     * 
     */
    public Output<List<String>> getRestrictions() {
        return this.restrictions;
    }

    public interface BuilderApplicator {
        public void apply(LienArgs.Builder a);
    }
    private static io.pulumi.gcp.resourcemanager.LienArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.resourcemanager.LienArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Lien(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Lien(String name) {
        this(name, LienArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Lien(String name, LienArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Lien(String name, LienArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:resourcemanager/lien:Lien", name, args == null ? LienArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Lien(String name, Output<String> id, @Nullable LienState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:resourcemanager/lien:Lien", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Lien get(String name, Output<String> id, @Nullable LienState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Lien(name, id, state, options);
    }
}
