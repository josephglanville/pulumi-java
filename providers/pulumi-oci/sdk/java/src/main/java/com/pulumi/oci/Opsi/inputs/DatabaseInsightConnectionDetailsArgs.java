// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Opsi.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Opsi.inputs.DatabaseInsightConnectionDetailsHostArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseInsightConnectionDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseInsightConnectionDetailsArgs Empty = new DatabaseInsightConnectionDetailsArgs();

    /**
     * Name of the listener host that will be used to create the connect string to the database.
     * 
     */
    @Import(name="hostName")
    private @Nullable Output<String> hostName;

    /**
     * @return Name of the listener host that will be used to create the connect string to the database.
     * 
     */
    public Optional<Output<String>> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * List of hosts and port for private endpoint accessed database resource.
     * 
     */
    @Import(name="hosts")
    private @Nullable Output<List<DatabaseInsightConnectionDetailsHostArgs>> hosts;

    /**
     * @return List of hosts and port for private endpoint accessed database resource.
     * 
     */
    public Optional<Output<List<DatabaseInsightConnectionDetailsHostArgs>>> hosts() {
        return Optional.ofNullable(this.hosts);
    }

    /**
     * Listener port number used for connection requests.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Listener port number used for connection requests.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Protocol used for connection requests for private endpoint accssed database resource.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return Protocol used for connection requests for private endpoint accssed database resource.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Database service name used for connection requests.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return Database service name used for connection requests.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    private DatabaseInsightConnectionDetailsArgs() {}

    private DatabaseInsightConnectionDetailsArgs(DatabaseInsightConnectionDetailsArgs $) {
        this.hostName = $.hostName;
        this.hosts = $.hosts;
        this.port = $.port;
        this.protocol = $.protocol;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseInsightConnectionDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseInsightConnectionDetailsArgs $;

        public Builder() {
            $ = new DatabaseInsightConnectionDetailsArgs();
        }

        public Builder(DatabaseInsightConnectionDetailsArgs defaults) {
            $ = new DatabaseInsightConnectionDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostName Name of the listener host that will be used to create the connect string to the database.
         * 
         * @return builder
         * 
         */
        public Builder hostName(@Nullable Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName Name of the listener host that will be used to create the connect string to the database.
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param hosts List of hosts and port for private endpoint accessed database resource.
         * 
         * @return builder
         * 
         */
        public Builder hosts(@Nullable Output<List<DatabaseInsightConnectionDetailsHostArgs>> hosts) {
            $.hosts = hosts;
            return this;
        }

        /**
         * @param hosts List of hosts and port for private endpoint accessed database resource.
         * 
         * @return builder
         * 
         */
        public Builder hosts(List<DatabaseInsightConnectionDetailsHostArgs> hosts) {
            return hosts(Output.of(hosts));
        }

        /**
         * @param hosts List of hosts and port for private endpoint accessed database resource.
         * 
         * @return builder
         * 
         */
        public Builder hosts(DatabaseInsightConnectionDetailsHostArgs... hosts) {
            return hosts(List.of(hosts));
        }

        /**
         * @param port Listener port number used for connection requests.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Listener port number used for connection requests.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol Protocol used for connection requests for private endpoint accssed database resource.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Protocol used for connection requests for private endpoint accssed database resource.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param serviceName Database service name used for connection requests.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Database service name used for connection requests.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public DatabaseInsightConnectionDetailsArgs build() {
            return $;
        }
    }

}
