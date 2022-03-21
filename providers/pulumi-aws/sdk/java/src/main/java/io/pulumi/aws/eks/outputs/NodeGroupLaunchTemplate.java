// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeGroupLaunchTemplate {
    /**
     * Identifier of the EC2 Launch Template. Conflicts with `name`.
     * 
     */
    private final @Nullable String id;
    /**
     * Name of the EC2 Launch Template. Conflicts with `id`.
     * 
     */
    private final @Nullable String name;
    /**
     * EC2 Launch Template version number. While the API accepts values like `$Default` and `$Latest`, the API will convert the value to the associated version number (e.g. `1`) on read and This provider will show a difference on next plan. Using the `default_version` or `latest_version` attribute of the `aws.ec2.LaunchTemplate` resource or data source is recommended for this argument.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private NodeGroupLaunchTemplate(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("version") String version) {
        this.id = id;
        this.name = name;
        this.version = version;
    }

    /**
     * Identifier of the EC2 Launch Template. Conflicts with `name`.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Name of the EC2 Launch Template. Conflicts with `id`.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * EC2 Launch Template version number. While the API accepts values like `$Default` and `$Latest`, the API will convert the value to the associated version number (e.g. `1`) on read and This provider will show a difference on next plan. Using the `default_version` or `latest_version` attribute of the `aws.ec2.LaunchTemplate` resource or data source is recommended for this argument.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupLaunchTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupLaunchTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public NodeGroupLaunchTemplate build() {
            return new NodeGroupLaunchTemplate(id, name, version);
        }
    }
}
