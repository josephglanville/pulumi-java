// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetManagedZoneResult {
    /**
     * A textual description field.
     * 
     */
    private final String description;
    /**
     * The fully qualified DNS name of this zone, e.g. `example.io.`.
     * 
     */
    private final String dnsName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * The list of nameservers that will be authoritative for this
     * domain. Use NS records to redirect from your DNS provider to these names,
     * thus making Google Cloud DNS authoritative for this zone.
     * 
     */
    private final List<String> nameServers;
    private final @Nullable String project;
    /**
     * The zone's visibility: public zones are exposed to the Internet,
     * while private zones are visible only to Virtual Private Cloud resources.
     * 
     */
    private final String visibility;

    @CustomType.Constructor
    private GetManagedZoneResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("dnsName") String dnsName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nameServers") List<String> nameServers,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("visibility") String visibility) {
        this.description = description;
        this.dnsName = dnsName;
        this.id = id;
        this.name = name;
        this.nameServers = nameServers;
        this.project = project;
        this.visibility = visibility;
    }

    /**
     * A textual description field.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The fully qualified DNS name of this zone, e.g. `example.io.`.
     * 
    */
    public String getDnsName() {
        return this.dnsName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The list of nameservers that will be authoritative for this
     * domain. Use NS records to redirect from your DNS provider to these names,
     * thus making Google Cloud DNS authoritative for this zone.
     * 
    */
    public List<String> getNameServers() {
        return this.nameServers;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    /**
     * The zone's visibility: public zones are exposed to the Internet,
     * while private zones are visible only to Virtual Private Cloud resources.
     * 
    */
    public String getVisibility() {
        return this.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedZoneResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String dnsName;
        private String id;
        private String name;
        private List<String> nameServers;
        private @Nullable String project;
        private String visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedZoneResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.dnsName = defaults.dnsName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.nameServers = defaults.nameServers;
    	      this.project = defaults.project;
    	      this.visibility = defaults.visibility;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder dnsName(String dnsName) {
            this.dnsName = Objects.requireNonNull(dnsName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nameServers(List<String> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }
        public Builder nameServers(String... nameServers) {
            return nameServers(List.of(nameServers));
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder visibility(String visibility) {
            this.visibility = Objects.requireNonNull(visibility);
            return this;
        }        public GetManagedZoneResult build() {
            return new GetManagedZoneResult(description, dnsName, id, name, nameServers, project, visibility);
        }
    }
}
